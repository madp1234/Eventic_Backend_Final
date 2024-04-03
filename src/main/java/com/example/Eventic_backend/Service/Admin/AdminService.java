package com.example.Eventic_backend.Service.Admin;


import com.example.Eventic_backend.Model.Admin;
import com.example.Eventic_backend.Model.User;
import com.example.Eventic_backend.Repository.Admin.AdminRepository;
import com.example.Eventic_backend.Repository.UserRepository;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class AdminService  {
    public AdminService() {
        // Default constructor
        userRepository = null;
    }
    private final UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    public AdminService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerAdmin(Admin admin) throws Exception {
        if (adminRepository.existsByUserName(admin.getUserName())) {
            throw new Exception("Username already exists");
        }

        if (adminRepository.existsByEmail(admin.getEmail())) {
            throw new Exception("Email already exists");
        }

        adminRepository.save(admin);
    }


     
}