import { IUser } from 'app/shared/model/user.model';
import { IPlayer } from 'app/shared/model//player.model';

export interface IDashboard {
  id?: number;
  username?: string;
  playerId?: number;
  secret?: string;
  user?: IUser;
  players?: IPlayer[];
}

export const defaultValue: Readonly<IDashboard> = {};
