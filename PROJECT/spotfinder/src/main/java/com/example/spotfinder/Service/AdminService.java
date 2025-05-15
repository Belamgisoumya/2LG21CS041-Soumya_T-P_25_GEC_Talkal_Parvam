package com.example.spotfinder.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spotfinder.Model.Admin;
import com.example.spotfinder.Repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository userRepository;

    public boolean authenticate(String email, String password) {
        Optional<Admin> user = userRepository.findByEmail(email);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}
