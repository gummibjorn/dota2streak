package com.zuehlke.dota2streak.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MatchPoller {
    private static final Logger log = LoggerFactory.getLogger(MatchPoller.class);

    @Scheduled(fixedRate = 5000)
    public void pollMatches() {
    }


}
