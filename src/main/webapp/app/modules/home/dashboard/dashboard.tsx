import React from 'react';
import { connect } from 'react-redux';
import { Player } from 'app/modules/home/player/player';
import { IPlayer } from 'app/shared/model/player.model';
import { getEntities, getEntity } from 'app/modules/home/dashboard/dashboard.reducer';
import { IRootState } from 'app/shared/reducers';
import { IDashboard } from 'app/shared/model/dashboard.model';

export interface IDashboardProp {
  players?: IPlayer[];
  getEntities?: Function;
  dashboards?: ReadonlyArray<IDashboard>;
  getEntity?: Function;
}

export class Dashboard extends React.Component<IDashboardProp> {
  componentDidMount() {
    this.props.getEntities();
  }

  componentDidUpdate() {
    if (this.props.dashboards && this.props.dashboards[0]) {
      this.props.getEntity(this.props.dashboards[0].id);
    }
  }

  render() {
    const { players, dashboards } = this.props;
    return (
      <div>
        {dashboards && players ? (
          <div>
            Dashboard: {dashboards[0].id}
            {players.map(player => {
              return <Player name={player.username} streak={player.streak} />;
            })}
          </div>
        ) : (
          ''
        )}
      </div>
    );
  }
}

const mapStateToProps = (storeState: IRootState) => ({
  players: storeState.dashboard.entity.players,
  dashboards: storeState.dashboard.entities
});

const mapDispatchToProps = {
  getEntities,
  getEntity
};

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(Dashboard);
