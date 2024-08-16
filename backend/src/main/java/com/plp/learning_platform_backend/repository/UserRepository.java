package com.plp.learning_platform_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.plp.learning_platform_backend.model.UserModel;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String>{
    Optional<UserModel> findByUsername(String username);
    Optional<UserModel> findByEmail(String email);
}
