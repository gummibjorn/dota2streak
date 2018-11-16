import React from 'react';
import { connect } from 'react-redux';
import { Link, RouteComponentProps } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
// tslint:disable-next-line:no-unused-variable
import { ICrudGetAction } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { IRootState } from 'app/shared/reducers';
import { getEntity } from './dashboard.reducer';
import { IDashboard } from 'app/shared/model/dashboard.model';
// tslint:disable-next-line:no-unused-variable
import { APP_DATE_FORMAT, APP_LOCAL_DATE_FORMAT } from 'app/config/constants';

export interface IDashboardDetailProps extends StateProps, DispatchProps, RouteComponentProps<{ id: string }> {}

export class DashboardDetail extends React.Component<IDashboardDetailProps> {
  componentDidMount() {
    this.props.getEntity(this.props.match.params.id);
  }

  render() {
    const { dashboardEntity } = this.props;
    return (
      <Row>
        <Col md="8">
          <h2>
            Dashboard [<b>{dashboardEntity.id}</b>]
          </h2>
          <dl className="jh-entity-details">
            <dt>
              <span id="username">Username</span>
            </dt>
            <dd>{dashboardEntity.username}</dd>
            <dt>
              <span id="playerId">Player Id</span>
            </dt>
            <dd>{dashboardEntity.playerId}</dd>
            <dt>
              <span id="secret">Secret</span>
            </dt>
            <dd>{dashboardEntity.secret}</dd>
            <dt>User</dt>
            <dd>{dashboardEntity.user ? dashboardEntity.user.id : ''}</dd>
            <dt>Players</dt>
            <dd>
              {dashboardEntity.players
                ? dashboardEntity.players.map((val, i) => (
                    <span key={val.id}>
                      <a>{val.id}</a>
                      {i === dashboardEntity.players.length - 1 ? '' : ', '}
                    </span>
                  ))
                : null}
            </dd>
          </dl>
          <Button tag={Link} to="/entity/dashboard" replace color="info">
            <FontAwesomeIcon icon="arrow-left" /> <span className="d-none d-md-inline">Back</span>
          </Button>
          &nbsp;
          <Button tag={Link} to={`/entity/dashboard/${dashboardEntity.id}/edit`} replace color="primary">
            <FontAwesomeIcon icon="pencil-alt" /> <span className="d-none d-md-inline">Edit</span>
          </Button>
        </Col>
      </Row>
    );
  }
}

const mapStateToProps = ({ dashboard }: IRootState) => ({
  dashboardEntity: dashboard.entity
});

const mapDispatchToProps = { getEntity };

type StateProps = ReturnType<typeof mapStateToProps>;
type DispatchProps = typeof mapDispatchToProps;

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(DashboardDetail);
