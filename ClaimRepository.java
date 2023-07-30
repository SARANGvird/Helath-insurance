package com.Solution.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Solution.in.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
    // Additional methods if needed
}
