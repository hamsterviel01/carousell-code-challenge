/**
 * Created by DrHamsterviel on 30/4/17.
 */
import React from 'react';
import TopTrendItemContainer from '../containers/TopTrendItemContainer'

require('react-flexgrid/less/flexgrid.less');

class TopTrendListComponent extends React.Component {
    render() {
        return (
            <div>
                <h2>Trending Now</h2>
                <TopTrendItemContainer />
                <TopTrendItemContainer />
            </div>
        );
    }
}

export default TopTrendListComponent;