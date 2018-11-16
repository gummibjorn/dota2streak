import React from 'react';
import { connect } from 'react-redux';
import { Link, RouteComponentProps } from 'react-router-dom';
import { Button, Col, Row, Table } from 'reactstrap';
// tslint:disable-next-line:no-unused-variable
import { ICrudGetAllAction } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { IRootState } from 'app/shared/reducers';
import { getEntities } from './dashboard.reducer';
import { IDashboard } from 'app/shared/model/dashboard.model';
// tslint:disable-next-line:no-unused-variable
import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';

export interface IDashboardProps extends StateProps, DispatchProps, RouteComponentProps<{ url: string }> {}

export class Dashboard extends React.Component<IDashboardProps> {
  componentDidMount() {
    this.props.getEntities();
  }

  render() {
    const { dashboardList, match } = this.props;
    return (
      <div>
        <h2 id="dashboard-heading">
          Dashboards
          <Link to={`${match.url}/new`} className="btn btn-primary float-right jh-create-entity" id="jh-create-entity">
            <FontAwesomeIcon icon="plus" />
            &nbsp; Create new Dashboard
          </Link>
        </h2>
        <div className="table-responsive">
          <Table responsive>
            <thead>
              <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Player Id</th>
                <th>Secret</th>
                <th>User</th>
                <th>Players</th>
                <th />
              </tr>
            </thead>
            <tbody>
              {dashboardList.map((dashboard, i) => (
                <tr key={`entity-${i}`}>
                  <td>
                    <Button tag={Link} to={`${match.url}/${dashboard.id}`} color="link" size="sm">
                      {dashboard.id}
                    </Button>
                  </td>
                  <td>{dashboard.username}</td>
                  <td>{dashboard.playerId}</td>
                  <td>{dashboard.secret}</td>
                  <td>{dashboard.user ? dashboard.user.id : ''}</td>
                  <td>
                    {dashboard.players
                      ? dashboard.players.map((val, j) => (
                          <span key={j}>
                            <Link to={`player/${val.id}`}>{val.id}</Link>
                            {j === dashboard.players.length - 1 ? '' : ', '}
                          </span>
                        ))
                      : null}
                  </td>
                  <td className="text-right">
                    <div className="btn-group flex-btn-group-container">
                      <Button tag={Link} to={`${match.url}/${dashboard.id}`} color="info" size="sm">
                        <FontAwesomeIcon icon="eye" /> <span className="d-none d-md-inline">View</span>
                      </Button>
                      <Button tag={Link} to={`${match.url}/${dashboard.id}/edit`} color="primary" size="sm">
                        <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
                      </Button>
                      <Button tag={Link} to={`${match.url}/${dashboard.id}/delete`} color="danger" size="sm">
                        <FontAwesomeIcon icon="trash" /> <span className="d-none d-md-inline">Delete</span>
                      </Button>
                    </div>
                  </td>
                </tr>
              ))}
            </tbody>
          </Table>
        </div>
      </div>
    );
  }
}

const mapStateToProps = ({ dashboard }: IRootState) => ({
  dashboardList: dashboard.entities
});

const mapDispatchToProps = {
  getEntities
};

type StateProps = ReturnType<typeof mapStateToProps>;
type DispatchProps = typeof mapDispatchToProps;

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(Dashboard);
