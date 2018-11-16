
# InlineResponse2003

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
**startTime** | **Integer** | Start time of the match in seconds elapsed since 1970 |  [optional]
**version** | **Integer** | version |  [optional]
**kills** | **Integer** | Total kills the player had at the end of the match |  [optional]
**deaths** | **Integer** | Total deaths the player had at the end of the match |  [optional]
**assists** | **Integer** | Total assists the player had at the end of the match |  [optional]
**skill** | **Integer** | Skill bracket assigned by Valve (Normal, High, Very High) |  [optional]
**lane** | **Integer** | Integer corresponding to which lane the player laned in for the match |  [optional]
**laneRole** | **Integer** | lane_role |  [optional]
**isRoaming** | **Boolean** | Boolean describing whether or not the player roamed |  [optional]
**cluster** | **Integer** | cluster |  [optional]
**leaverStatus** | **Integer** | Integer describing whether or not the player left the game. 0: didn&#39;t leave. 1: left safely. 2+: Abandoned |  [optional]
**partySize** | **Integer** | Size of the players party. If not in a party, will return 1. |  [optional]



