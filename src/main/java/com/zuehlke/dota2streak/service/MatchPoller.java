package com.zuehlke.dota2streak.service;

import com.zuehlke.dota2streak.domain.Player;
import com.zuehlke.dota2streak.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class MatchPoller {
    private static final Logger log = LoggerFactory.getLogger(MatchPoller.class);

    private List<Player> players;
    private PlayerRepository playerRepository;


    public MatchPoller(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Scheduled(fixedRate = 60000)
    public void pollMatches() {

        log.debug("Running poller");

        this.players = playerRepository.findAll();

        for (Player p : this.players) {
            RestTemplate restTemplate = new RestTemplate();

            String url = "https://api.opendota.com/api/players/{account_id}/matches";
            url = url.replace("{account_id}", p.getPlayerId().toString());
            ResponseEntity<List<Match>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Match>>() {
            });
            List<Match> matches = responseEntity.getBody();

            if (matches != null && !matches.isEmpty()) {
                p.setStreak(this.calculateStreak(matches));
                this.playerRepository.save(p);
            }

            log.debug("Fetched matches for player" + p.getUsername());
        }

    }

    private int calculateStreak(List<Match> matches) {
        boolean isWinning = this.didPlayerWin(matches.get(0));

        int streak = isWinning ? 1 : -1;
        int i = 1;
        while (this.didPlayerWin(matches.get(i)) == isWinning) {
            if (isWinning) ++streak;
            else --streak;
            ++i;
        }

        return streak;
    }

    private boolean didPlayerWin(Match match) {
        return (match.getPlayerSlot() < 4) == match.isRadiantWin();
    }

}
