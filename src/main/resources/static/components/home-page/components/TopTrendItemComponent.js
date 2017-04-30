/**
 * Created by DrHamsterviel on 30/4/17.
 */
import React from 'react';
import TopTrendItemContainer from '../containers/TopTrendItemContainer'

require('react-flexgrid/less/flexgrid.less');

class TopTrendItemComponent extends React.Component {
    render() {
        return (
            <div className="top-trend-item">
                <p>Content of post (less than 255 words)</p>
                <div>
                    213 upvotes - 30 downvotes
                </div>
                <button className="button-sucess">Upvote</button>
                <button className="button-warning">Downvote</button>
            </div>
        );
    }
}

export default TopTrendItemComponent;