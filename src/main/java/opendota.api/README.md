# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.BenchmarksApi;

import java.io.File;
import java.util.*;

public class BenchmarksApiExample {

    public static void main(String[] args) {
        
        BenchmarksApi apiInstance = new BenchmarksApi();
        String heroId = "heroId_example"; // String | Hero ID
        try {
            InlineResponse20020 result = apiInstance.benchmarksGet(heroId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarksApi#benchmarksGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.opendota.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BenchmarksApi* | [**benchmarksGet**](docs/BenchmarksApi.md#benchmarksGet) | **GET** /benchmarks | GET /benchmarks
*DistributionsApi* | [**distributionsGet**](docs/DistributionsApi.md#distributionsGet) | **GET** /distributions | GET /distributions
*ExplorerApi* | [**explorerGet**](docs/ExplorerApi.md#explorerGet) | **GET** /explorer | GET /explorer
*HealthApi* | [**healthGet**](docs/HealthApi.md#healthGet) | **GET** /health | GET /health
*HeroStatsApi* | [**heroStatsGet**](docs/HeroStatsApi.md#heroStatsGet) | **GET** /heroStats | GET /heroStats
*HeroesApi* | [**heroesGet**](docs/HeroesApi.md#heroesGet) | **GET** /heroes | GET /heroes
*HeroesApi* | [**heroesHeroIdDurationsGet**](docs/HeroesApi.md#heroesHeroIdDurationsGet) | **GET** /heroes/{hero_id}/durations | GET /heroes/{hero_id}/durations
*HeroesApi* | [**heroesHeroIdMatchesGet**](docs/HeroesApi.md#heroesHeroIdMatchesGet) | **GET** /heroes/{hero_id}/matches | GET /heroes/{hero_id}/matches
*HeroesApi* | [**heroesHeroIdMatchupsGet**](docs/HeroesApi.md#heroesHeroIdMatchupsGet) | **GET** /heroes/{hero_id}/matchups | GET /heroes/{hero_id}/matchups
*HeroesApi* | [**heroesHeroIdPlayersGet**](docs/HeroesApi.md#heroesHeroIdPlayersGet) | **GET** /heroes/{hero_id}/players | GET /heroes/{hero_id}/players
*LeaguesApi* | [**leaguesGet**](docs/LeaguesApi.md#leaguesGet) | **GET** /leagues | GET /leagues
*LiveApi* | [**liveGet**](docs/LiveApi.md#liveGet) | **GET** /live | GET /live
*MatchesApi* | [**matchesMatchIdGet**](docs/MatchesApi.md#matchesMatchIdGet) | **GET** /matches/{match_id} | GET /matches/{match_id}
*MetadataApi* | [**metadataGet**](docs/MetadataApi.md#metadataGet) | **GET** /metadata | GET /metadata
*PlayersApi* | [**playersAccountIdCountsGet**](docs/PlayersApi.md#playersAccountIdCountsGet) | **GET** /players/{account_id}/counts | GET /players/{account_id}/counts
*PlayersApi* | [**playersAccountIdGet**](docs/PlayersApi.md#playersAccountIdGet) | **GET** /players/{account_id} | GET /players/{account_id}
*PlayersApi* | [**playersAccountIdHeroesGet**](docs/PlayersApi.md#playersAccountIdHeroesGet) | **GET** /players/{account_id}/heroes | GET /players/{account_id}/heroes
*PlayersApi* | [**playersAccountIdHistogramsFieldGet**](docs/PlayersApi.md#playersAccountIdHistogramsFieldGet) | **GET** /players/{account_id}/histograms/{field} | GET /players/{account_id}/histograms
*PlayersApi* | [**playersAccountIdMatchesGet**](docs/PlayersApi.md#playersAccountIdMatchesGet) | **GET** /players/{account_id}/matches | GET /players/{account_id}/matches
*PlayersApi* | [**playersAccountIdPeersGet**](docs/PlayersApi.md#playersAccountIdPeersGet) | **GET** /players/{account_id}/peers | GET /players/{account_id}/peers
*PlayersApi* | [**playersAccountIdProsGet**](docs/PlayersApi.md#playersAccountIdProsGet) | **GET** /players/{account_id}/pros | GET /players/{account_id}/pros
*PlayersApi* | [**playersAccountIdRankingsGet**](docs/PlayersApi.md#playersAccountIdRankingsGet) | **GET** /players/{account_id}/rankings | GET /players/{account_id}/rankings
*PlayersApi* | [**playersAccountIdRatingsGet**](docs/PlayersApi.md#playersAccountIdRatingsGet) | **GET** /players/{account_id}/ratings | GET /players/{account_id}/ratings
*PlayersApi* | [**playersAccountIdRecentMatchesGet**](docs/PlayersApi.md#playersAccountIdRecentMatchesGet) | **GET** /players/{account_id}/recentMatches | GET /players/{account_id}/recentMatches
*PlayersApi* | [**playersAccountIdRefreshPost**](docs/PlayersApi.md#playersAccountIdRefreshPost) | **POST** /players/{account_id}/refresh | POST /players/{account_id}/refresh
*PlayersApi* | [**playersAccountIdTotalsGet**](docs/PlayersApi.md#playersAccountIdTotalsGet) | **GET** /players/{account_id}/totals | GET /players/{account_id}/totals
*PlayersApi* | [**playersAccountIdWardmapGet**](docs/PlayersApi.md#playersAccountIdWardmapGet) | **GET** /players/{account_id}/wardmap | GET /players/{account_id}/wardmap
*PlayersApi* | [**playersAccountIdWlGet**](docs/PlayersApi.md#playersAccountIdWlGet) | **GET** /players/{account_id}/wl | GET /players/{account_id}/wl
*PlayersApi* | [**playersAccountIdWordcloudGet**](docs/PlayersApi.md#playersAccountIdWordcloudGet) | **GET** /players/{account_id}/wordcloud | GET /players/{account_id}/wordcloud
*ProMatchesApi* | [**proMatchesGet**](docs/ProMatchesApi.md#proMatchesGet) | **GET** /proMatches | GET /proMatches
*ProPlayersApi* | [**proPlayersGet**](docs/ProPlayersApi.md#proPlayersGet) | **GET** /proPlayers | GET /proPlayers
*PublicMatchesApi* | [**publicMatchesGet**](docs/PublicMatchesApi.md#publicMatchesGet) | **GET** /publicMatches | GET /publicMatches
*RankingsApi* | [**rankingsGet**](docs/RankingsApi.md#rankingsGet) | **GET** /rankings | GET /rankings
*RecordsApi* | [**recordsFieldGet**](docs/RecordsApi.md#recordsFieldGet) | **GET** /records/{field} | GET /records/{field}
*ReplaysApi* | [**replaysGet**](docs/ReplaysApi.md#replaysGet) | **GET** /replays | GET /replays
*RequestApi* | [**requestJobIdGet**](docs/RequestApi.md#requestJobIdGet) | **GET** /request/{jobId} | GET /request/{jobId}
*RequestApi* | [**requestMatchIdPost**](docs/RequestApi.md#requestMatchIdPost) | **POST** /request/{match_id} | POST /request/{match_id}
*ScenariosApi* | [**scenariosItemTimingsGet**](docs/ScenariosApi.md#scenariosItemTimingsGet) | **GET** /scenarios/itemTimings | GET /scenarios/itemTimings
*ScenariosApi* | [**scenariosLaneRolesGet**](docs/ScenariosApi.md#scenariosLaneRolesGet) | **GET** /scenarios/laneRoles | GET /scenarios/laneRoles
*ScenariosApi* | [**scenariosMiscGet**](docs/ScenariosApi.md#scenariosMiscGet) | **GET** /scenarios/misc | GET /scenarios/misc
*SchemaApi* | [**schemaGet**](docs/SchemaApi.md#schemaGet) | **GET** /schema | GET /schema
*SearchApi* | [**searchGet**](docs/SearchApi.md#searchGet) | **GET** /search | GET /search
*StatusApi* | [**adminApiMetricsGet**](docs/StatusApi.md#adminApiMetricsGet) | **GET** /admin/apiMetrics | GET /admin/apiMetrics
*StatusApi* | [**statusGet**](docs/StatusApi.md#statusGet) | **GET** /status | GET /status
*TeamsApi* | [**teamsGet**](docs/TeamsApi.md#teamsGet) | **GET** /teams | GET /teams
*TeamsApi* | [**teamsTeamIdGet**](docs/TeamsApi.md#teamsTeamIdGet) | **GET** /teams/{team_id} | GET /teams/{team_id}
*TeamsApi* | [**teamsTeamIdHeroesGet**](docs/TeamsApi.md#teamsTeamIdHeroesGet) | **GET** /teams/{team_id}/heroes | GET /teams/{team_id}/heroes
*TeamsApi* | [**teamsTeamIdMatchesGet**](docs/TeamsApi.md#teamsTeamIdMatchesGet) | **GET** /teams/{team_id}/matches | GET /teams/{team_id}/matches
*TeamsApi* | [**teamsTeamIdPlayersGet**](docs/TeamsApi.md#teamsTeamIdPlayersGet) | **GET** /teams/{team_id}/players | GET /teams/{team_id}/players


## Documentation for Models

 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse20016Cheese](docs/InlineResponse20016Cheese.md)
 - [InlineResponse20017](docs/InlineResponse20017.md)
 - [InlineResponse20017CountryMmr](docs/InlineResponse20017CountryMmr.md)
 - [InlineResponse20017CountryMmrFields](docs/InlineResponse20017CountryMmrFields.md)
 - [InlineResponse20017CountryMmrRows](docs/InlineResponse20017CountryMmrRows.md)
 - [InlineResponse20017Mmr](docs/InlineResponse20017Mmr.md)
 - [InlineResponse20017Ranks](docs/InlineResponse20017Ranks.md)
 - [InlineResponse20017RanksFields](docs/InlineResponse20017RanksFields.md)
 - [InlineResponse20017RanksRows](docs/InlineResponse20017RanksRows.md)
 - [InlineResponse20017RanksSum](docs/InlineResponse20017RanksSum.md)
 - [InlineResponse20018](docs/InlineResponse20018.md)
 - [InlineResponse20019](docs/InlineResponse20019.md)
 - [InlineResponse20019Rankings](docs/InlineResponse20019Rankings.md)
 - [InlineResponse2001MmrEstimate](docs/InlineResponse2001MmrEstimate.md)
 - [InlineResponse2001Profile](docs/InlineResponse2001Profile.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse20020](docs/InlineResponse20020.md)
 - [InlineResponse20020Result](docs/InlineResponse20020Result.md)
 - [InlineResponse20020ResultGoldPerMin](docs/InlineResponse20020ResultGoldPerMin.md)
 - [InlineResponse20021](docs/InlineResponse20021.md)
 - [InlineResponse20022](docs/InlineResponse20022.md)
 - [InlineResponse20023](docs/InlineResponse20023.md)
 - [InlineResponse20024](docs/InlineResponse20024.md)
 - [InlineResponse20025](docs/InlineResponse20025.md)
 - [InlineResponse20026](docs/InlineResponse20026.md)
 - [InlineResponse20027](docs/InlineResponse20027.md)
 - [InlineResponse20028](docs/InlineResponse20028.md)
 - [InlineResponse20029](docs/InlineResponse20029.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse20030](docs/InlineResponse20030.md)
 - [InlineResponse20031](docs/InlineResponse20031.md)
 - [InlineResponse20032](docs/InlineResponse20032.md)
 - [InlineResponse20033](docs/InlineResponse20033.md)
 - [InlineResponse20034](docs/InlineResponse20034.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse200BuybackLog](docs/InlineResponse200BuybackLog.md)
 - [InlineResponse200Chat](docs/InlineResponse200Chat.md)
 - [InlineResponse200DraftTimings](docs/InlineResponse200DraftTimings.md)
 - [InlineResponse200KillsLog](docs/InlineResponse200KillsLog.md)
 - [InlineResponse200Players](docs/InlineResponse200Players.md)
 - [InlineResponse200PurchaseLog](docs/InlineResponse200PurchaseLog.md)
 - [InlineResponse200RunesLog](docs/InlineResponse200RunesLog.md)
 - [PlayersaccountIdmatchesHeroes](docs/PlayersaccountIdmatchesHeroes.md)
 - [PlayersaccountIdmatchesHeroesPlayerSlot](docs/PlayersaccountIdmatchesHeroesPlayerSlot.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



