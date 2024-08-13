package com.plp.learning_platform_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plp.learning_platform_backend.model.UserModel;
import com.plp.learning_platform_backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<UserModel> findAllUsers(){
        return userRepository.findAll();
    }

    public Optional<UserModel> findUserById(String id){
        return userRepository.findById(id);
    }

    public Optional<UserModel> findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }
    
    public UserModel createUser(UserModel user){
        return userRepository.save(user);
    }

    public UserModel updateUser(String id, UserModel user){
        Optional<UserModel> existingUser = userRepository.findById(id);
        if(existingUser.isPresent()){
            UserModel updatedUser = existingUser.get();
            updatedUser.setFirstName(user.getFirstName());
            updatedUser.setLastName(user.getLastName());
            updatedUser.setUsername(user.getUsername());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setPassword(user.getPassword());
            return userRepository.save(updatedUser);
        }
        return null;
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
}
