package com.jppokedev.modulomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jppokedev.modulomongo.domain.Post;

@Repository
public interface PostRepository  extends MongoRepository<Post, String>{
	
}
