package com.Solution.in.service;

import java.util.List;
import java.util.Optional;

import com.Solution.in.model.Us;

public interface UsService {
    Us createUs(Us us);
    Optional<Us> getUsById(Long usId);
    List<Us> getAllUs();
    Us updateUs(Long userId, Us us);
    void deleteUs(Long usId);
	
}
