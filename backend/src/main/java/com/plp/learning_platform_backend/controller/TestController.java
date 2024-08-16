package com.plp.learning_platform_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.plp.learning_platform_backend.service.TestService;
import com.plp.learning_platform_backend.model.TestModel;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/add")
    public TestModel addTestSample(@RequestParam String name) {
        return testService.addTestSample(name);
    }

    @GetMapping("/{id}")
    public TestModel getTestSample(@PathVariable String id) {
        return testService.getTestSample(id);
    }
}
