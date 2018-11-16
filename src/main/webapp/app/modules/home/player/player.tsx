import React from 'react';

export interface IPlayerProp extends StateProps {}

export class Player extends React.Component<IPlayerProp> {
  render() {
    return (
      <div>
        {this.props.name}
        {this.props.streak}
      </div>
    );
  }
}

type StateProps = { name: string; streak: number };
