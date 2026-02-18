package com.auca.restfulapi.user.service;

import com.auca.restfulapi.user.model.UserProfile;
import com.auca.restfulapi.user.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    public List<UserProfile> getAllUsers() {
        return userProfileRepository.findAll();
    }

    public Optional<UserProfile> getUserById(Long id) {
        return userProfileRepository.findById(id);
    }

    public UserProfile createUser(UserProfile user) {
        return userProfileRepository.save(user);
    }

    public UserProfile updateUser(Long id, UserProfile userDetails) {
        UserProfile user = userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());
        user.setFullName(userDetails.getFullName());
        user.setAge(userDetails.getAge());
        user.setCountry(userDetails.getCountry());
        user.setBio(userDetails.getBio());
        user.setActive(userDetails.isActive());
        return userProfileRepository.save(user);
    }

    public void deleteUser(Long id) {
        userProfileRepository.deleteById(id);
    }

    public UserProfile activateUser(Long id) {
        UserProfile user = userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setActive(true);
        return userProfileRepository.save(user);
    }

    public List<UserProfile> getUsersByCountry(String country) {
        return userProfileRepository.findByCountry(country);
    }

    public List<UserProfile> getUsersByAgeRange(int minAge, int maxAge) {
        return userProfileRepository.findByAgeBetween(minAge, maxAge);
    }
}
