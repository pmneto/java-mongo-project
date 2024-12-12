package com.paulo.repository;

import com.paulo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository; // Annotation here

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}