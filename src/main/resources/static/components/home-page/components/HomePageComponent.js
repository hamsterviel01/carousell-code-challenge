/**
 * Created by DrHamsterviel on 29/4/17.
 */
import React from 'react'
import { withRouter } from 'react-router'
import CreateNewPostContainer from '../containers/CreateNewPostContainer'
import TopTrendListContainer from '../containers/TopTrendListContainer'

require('react-flexgrid/less/flexgrid.less');

class HomePageComponent extends React.Component {
    render() {
        return (
            <div>
                <h1>Welcome to Carousell's Reddit Clone</h1>
                <CreateNewPostContainer />
                <TopTrendListContainer />
            </div>
        )
    }
}

export default withRouter(HomePageComponent);