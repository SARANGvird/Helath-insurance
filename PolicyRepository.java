package com.Solution.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Solution.in.model.Policy;
@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
    // Additional methods if needed
}
