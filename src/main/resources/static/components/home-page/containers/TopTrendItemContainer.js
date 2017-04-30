/**
 * Created by DrHamsterviel on 30/4/17.
 */
import { connect } from 'react-redux'
import TopTrendItemComponent from "../components/TopTrendItemComponent"

const mapStateToProps = (state, ownProps) => {
    return {

    }
};

const mapDispatchToProps = (dispatch) => {
    return {

    }
};

const TopTrendItemContainer = connect(
    mapStateToProps,
    mapDispatchToProps
)(TopTrendItemComponent);

export default TopTrendItemContainer;