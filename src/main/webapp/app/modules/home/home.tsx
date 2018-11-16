import './home.scss';

import React from 'react';
import { Link } from 'react-router-dom';

import { connect } from 'react-redux';
import { Row, Col, Alert } from 'reactstrap';

import { getSession } from 'app/shared/reducers/authentication';
import Dashboard from 'app/modules/home/dashboard/dashboard';

export interface IHomeProp extends StateProps, DispatchProps {}

export class Home extends React.Component<IHomeProp> {
  state = {
    displayLoginInfo: true
  };

  componentDidMount() {
    this.props.getSession();

    setTimeout(() => {
      this.setState({ displayLoginInfo: false });
    }, 3000);
  }

  render() {
    const { account } = this.props;
    return (
      <div>
        {this.state.displayLoginInfo ? (
          <Row>
            <Col md="9">
              {account && account.login ? (
                <div>
                  <Alert color="success">You are logged in as user {account.login}.</Alert>
                </div>
              ) : (
                <div>
                  <Alert color="warning">
                    If you want to
                    <Link to="/login" className="alert-link">
                      {' '}
                      sign in
                    </Link>
                    , you can try the default accounts:
                    <br />- Administrator (login=&quot;admin&quot; and password=&quot;admin&quot;)
                    <br />- User (login=&quot;user&quot; and password=&quot;user&quot;).
                  </Alert>
                  <Alert color="warning">
                    You do not have an account yet?&nbsp;
                    <Link to="/register" className="alert-link">
                      Register a new account
                    </Link>
                  </Alert>
                </div>
              )}
            </Col>
          </Row>
        ) : (
          <h2>Welcome to the streak dashboard</h2>
        )}
        <Dashboard />
      </div>
    );
  }
}

const mapStateToProps = storeState => ({
  account: storeState.authentication.account,
  isAuthenticated: storeState.authentication.isAuthenticated
});

const mapDispatchToProps = { getSession };

type StateProps = ReturnType<typeof mapStateToProps>;
type DispatchProps = typeof mapDispatchToProps;

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(Home);
