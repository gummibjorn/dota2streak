export interface IPlayer {
  id?: number;
  playerId?: number;
  streak?: number;
  username?: string;
}

export const defaultValue: Readonly<IPlayer> = {};
