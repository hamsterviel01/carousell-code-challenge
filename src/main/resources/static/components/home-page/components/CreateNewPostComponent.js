/**
 * Created by DrHamsterviel on 30/4/17.
 */
import React from 'react'

require('react-flexgrid/less/flexgrid.less');

class CreateNewPost extends React.Component {
    render() {
        return (
            <div>
                <h2>Let post something!</h2>
                <form>
                    <p>
                        <textarea title="What's on your mind?" className="create-new-post-text-area" placeholder="What's on your mind?"></textarea>
                    </p>
                    <p style={{marginTop: 0}}>
                        <button className="accept" style={{marginTop: 0}}>Post</button>
                    </p>
                </form>
            </div>
        )
    }
}

export default CreateNewPost;