package com.jppokedev.modulomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jppokedev.modulomongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{	
}
