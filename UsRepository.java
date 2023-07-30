package com.Solution.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Solution.in.model.Us;


@Repository
public interface UsRepository extends JpaRepository<Us, Long> {
    // Additional methods if needed
}
