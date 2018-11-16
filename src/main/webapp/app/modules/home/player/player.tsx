import './player.css';
import React from 'react';
import Card from '@material-ui/core/Card';
import CardContent from '@material-ui/core/CardContent';
import Typography from '@material-ui/core/Typography';

export interface IPlayerProp extends StateProps {}

export class Player extends React.Component<IPlayerProp> {
  render() {
    return (
      <Card className="card">
        <CardContent>
          <Typography color="textSecondary" gutterBottom>
            {this.props.name}
          </Typography>

          <Typography gutterBottom>{this.props.streak}</Typography>
        </CardContent>
      </Card>
    );
  }
}

type StateProps = { name: string; streak: number };
