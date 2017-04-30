/**
 * Created by DrHamsterviel on 30/4/17.
 */
import { connect } from 'react-redux'
import CreateNewPostComponent from "../components/CreateNewPostComponent"

const mapStateToProps = (state, ownProps) => {
    return {

    }
};

const mapDispatchToProps = (dispatch) => {
    return {

    }
};

const CreateNewPostContainer = connect(
    mapStateToProps,
    mapDispatchToProps
)(CreateNewPostComponent);

export default CreateNewPostContainer;