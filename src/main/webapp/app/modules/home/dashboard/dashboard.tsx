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

  render() {
    const { dashboards } = this.props;
    return (
      <div>
        {dashboards && dashboards[0] ? (
          <div style={{ display: 'flex', flexDirection: 'row' }}>
            {dashboards[0].players.sort((p1, p2) => (p1.streak < p2.streak ? 1 : -1)).map(player => (
              <Player key={player.id} name={player.username} streak={player.streak} />
            ))}
          </div>
        ) : (
          ''
        )}
      </div>
    );
  }
}

const mapStateToProps = (storeState: IRootState) => ({
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
