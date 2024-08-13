package com.plp.learning_platform_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.plp.learning_platform_backend.model.TestModel;

public interface TestRepository extends MongoRepository<TestModel, String> {
}
