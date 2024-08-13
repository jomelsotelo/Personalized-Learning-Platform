package com.plp.learning_platform_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plp.learning_platform_backend.repository.TestRepository;
import com.plp.learning_platform_backend.model.TestModel;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public TestModel addTestSample(String name) {
        TestModel testModel = new TestModel();
        testModel.setName(name);
        return testRepository.save(testModel);
    }

    public TestModel getTestSample(String id) {
        return testRepository.findById(id).orElse(null);
    }
}
