
# InlineResponse2004

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchId** | **Integer** | Match ID |  [optional]
**playerSlot** | **Integer** | Which slot the player is in. 0-127 are Radiant, 128-255 are Dire |  [optional]
**radiantWin** | **Boolean** | Boolean indicating whether Radiant won the match |  [optional]
**duration** | **Integer** | Duration of the game in seconds |  [optional]
**gameMode** | **Integer** | Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json |  [optional]
**lobbyType** | **Integer** | Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json |  [optional]
**heroId** | **Integer** | The ID value of the hero played |  [optional]
**startTime** | **Integer** | Time the game started in seconds since 1970 |  [optional]
**version** | **Integer** | version |  [optional]
**kills** | **Integer** | Total kills the player had at the end of the game |  [optional]
**deaths** | **Integer** | Total deaths the player had at the end of the game |  [optional]
**assists** | **Integer** | Total assists the player had at the end of the game |  [optional]
**skill** | **Integer** | Skill bracket assigned by Valve (Normal, High, Very High) |  [optional]
**partySize** | **Integer** | Size of the player&#39;s party |  [optional]
**heroes** | [**PlayersaccountIdmatchesHeroes**](PlayersaccountIdmatchesHeroes.md) |  |  [optional]



