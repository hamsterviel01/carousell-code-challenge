package com.hamsterviel01.www.entity;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

/**
 * This class store data of one single post.
 * 
 * @author DrHamsterviel
 *
 */
@Getter
@Setter
public class PostEntity implements Comparable<PostEntity> {
	private String id;
	private String content;
	private int upvote;
	private int downvote;
	
	public PostEntity(String content) {
		id = UUID.randomUUID().toString();
		this.content = content;
	}
	
	public void upvotePost() {
		upvote++;
	}
	
	public void downvotePost() {
		downvote++;
	}

	@Override
	public int compareTo(PostEntity o) {
		//Sort in descending order
		return o.getUpvote() - this.upvote;
	}
}
