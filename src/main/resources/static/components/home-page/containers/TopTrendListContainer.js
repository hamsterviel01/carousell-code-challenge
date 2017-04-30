/**
 * Created by DrHamsterviel on 30/4/17.
 */
import { connect } from 'react-redux'
import TopTrendListComponent from "../components/TopTrendListComponent"

const mapStateToProps = (state, ownProps) => {
    return {

    }
};

const mapDispatchToProps = (dispatch) => {
    return {

    }
};

const TopTrendListContainer = connect(
    mapStateToProps,
    mapDispatchToProps
)(TopTrendListComponent);

export default TopTrendListContainer;