/**
 * Created by DrHamsterviel on 29/4/17.
 */
import React from 'react';
import { connect } from 'react-redux';
import { withRouter } from 'react-router';

require('react-flexgrid/less/flexgrid.less');

class Main extends React.Component {
    componentDidMount() {
        //this.props.dispatch(MainPageActions.getLandscapeList());
    }

    render() {
        return (
            <div>
                This is MainContainer
            </div>
        );
    }
}

function mapStateToProps(state, ownProps) {
    //const mainPageState = state.get('mainPage');

    return {
        landscapeList: [
            {
                name: 'develop'
            },
            {
                name: 'staging'
            }
        ],
        selectedLandscape: 'develop',
        selectedTenant: 'edp2-default',
    };
}

export default connect(mapStateToProps)(withRouter(Main));