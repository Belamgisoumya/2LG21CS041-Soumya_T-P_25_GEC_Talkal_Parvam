package com.example.spotfinder.Repository;

import org.springframework.boot.autoconfigure.condition.ConditionMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ConditionMessage, Long> {
}
