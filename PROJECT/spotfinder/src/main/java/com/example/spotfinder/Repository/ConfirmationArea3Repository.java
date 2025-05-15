package com.example.spotfinder.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spotfinder.Model.Confirmation;

@Repository
public interface ConfirmationArea3Repository extends JpaRepository<Confirmation, Long> {
    // Optional: Add custom queries if needed
}
