package com.example.spotfinder.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spotfinder.Model.Admin;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByEmail(String email);
}
