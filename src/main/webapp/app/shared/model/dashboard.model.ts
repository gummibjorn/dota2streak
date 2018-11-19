import { IUser } from 'app/shared/model/user.model';
import { IPlayer } from 'app/shared/model//player.model';

export interface IDashboard {
  id?: number;
  user?: IUser;
  players?: IPlayer[];
}

export const defaultValue: Readonly<IDashboard> = {};
