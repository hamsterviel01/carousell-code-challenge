/**
 * Created by DrHamsterviel on 29/4/17.
 */
import { combineReducers } from 'redux-immutable';
import Immutable from 'immutable';

const initialState = Immutable.fromJS({
    uploadFlow: {
        uploadedFile: '',
        uploadErrorMsg: ''
    },
    uploadScript: {
        xmlDescFile: '',
        handlersFile: '',
        tasksFile: '',
        defaultsFile: '',
        templatesFile: '',
        filesFile: '',
        metaFile: '',
        uploadStatus: '',
        uploadErrorMsg: ''
    }
});

const reducer = (state = initialState, action) => {
    if(action.handler){
        var nextState = action.handler(state, action.args);
        return (nextState) ? (nextState): state;
    }

    else return state;
}


export default combineReducers({
    // auth: authReducer,
    app: reducer
});