package com.hamsterviel01.www.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import org.springframework.stereotype.Repository;

import com.hamsterviel01.www.entity.PostEntity;

@Repository
public class PostDao {
	/**
	 * Store all {@link PostEntity} in descending order according to its up vote
	 * count.
	 */
	private final ArrayList<PostEntity> listOfAllPosts = new ArrayList<PostEntity>();

	/**
	 * Lock for {@link #listOfAllPosts}.
	 */
	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	/**
	 * Add {@link PostEntity} object to {@link #listOfAllPosts} and sort array.
	 * 
	 * @param e
	 * @return List of 20 {@link PostEntity} instances with top upvote count.
	 */
	public List<PostEntity> createNewPost(PostEntity e) {
		WriteLock writeLock = lock.writeLock();
		try {
			writeLock.lock();
			listOfAllPosts.add(e);
			Collections.sort(listOfAllPosts);
		} finally {
			writeLock.unlock();
		}

		return returnTop20Posts();
	}

	/**
	 * This method looks for {@link PostEntity} item in {@link #listOfAllPosts}
	 * that has id as specified. It will return list of top 20 posts with
	 * highest upvote count.
	 * 
	 * @param id
	 * @return List of 20 {@link PostEntity} instances with top upvote count.
	 */
	public List<PostEntity> upvote(String id) {
		WriteLock writeLock = lock.writeLock();
		try {
			writeLock.lock();
			int index = findPostEntityById(id);
			PostEntity post = listOfAllPosts.get(index);
			post.upvotePost();
			if (index > 0 && post.getUpvote() > listOfAllPosts.get(index - 1).getUpvote()) {
				swap(index, index + 1);
			}
		} finally {
			writeLock.unlock();
		}

		return returnTop20Posts();
	}

	/**
	 * This method looks for {@link PostEntity} item in {@link #listOfAllPosts}
	 * that has id as specified. It will return list of top 20 posts with
	 * highest upvote count.
	 * 
	 * @param id
	 * @return List of 20 {@link PostEntity} instances with top upvote count.
	 */
	public List<PostEntity> downvote(String id) {
		WriteLock writeLock = lock.writeLock();
		try {
			writeLock.lock();
			int index = findPostEntityById(id);
			PostEntity post = listOfAllPosts.get(index);
			post.downvotePost();
		} finally {
			writeLock.unlock();
		}

		return returnTop20Posts();
	}

	/**
	 * This method will return list of top 20 posts with highest upvote count.
	 * 
	 * @return List of 20 {@link PostEntity} instances with top upvote count.
	 */
	public List<PostEntity> returnTop20Posts() {
		ReadLock readLock = lock.readLock();
		try {
			readLock.lock();
			List<PostEntity> top20Posts = new ArrayList<PostEntity>();
			for (int i = 0; i < 20 || i < listOfAllPosts.size(); i++) {
				top20Posts.add(listOfAllPosts.get(i));
			}
			return top20Posts;
		} finally {
			readLock.unlock();
		}
	}

	private void swap(int i, int j) {
		PostEntity tmp = listOfAllPosts.get(i);
		WriteLock writeLock = lock.writeLock();
		try {
			writeLock.lock();
			listOfAllPosts.set(i, listOfAllPosts.get(j));
			listOfAllPosts.set(j, tmp);
		} finally {
			writeLock.unlock();
		}
	}

	private int findPostEntityById(String id) {
		for (int i = 0; i < listOfAllPosts.size(); i++) {
			if (listOfAllPosts.get(i).getId().equals(id)) {
				return i;
			}
		}
		throw new NullPointerException();
	}
}
