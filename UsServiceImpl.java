package com.Solution.in.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Solution.in.model.Us;
import com.Solution.in.repository.UsRepository;
import com.Solution.in.service.UsService;

@Service
public class UsServiceImpl implements UsService {
    private final UsRepository usRepository;
    
    public UsServiceImpl(UsRepository usRepository) {
        this.usRepository = usRepository;
    }
    
    @Override
    public Us createUs(Us us) {
        // Add logic to create a new user
        return usRepository.save(us);
    }
    
    @Override
    public Optional<Us> getUsById(Long usId) {
        // Add logic to get a user by ID
        return usRepository.findById(usId);
    }
    
    @Override
    public List<Us> getAllUs() {
        // Add logic to get all users
        return usRepository.findAll();
    }
    
    @Override
    public Us updateUs(Long usId, Us us) {
        // Add logic to update a user
        Us existingUs = usRepository.findById(usId).orElse(null);
        if (existingUs != null) {
            existingUs.setName(us.getName());
            existingUs.setEmail(us.getEmail());
            // Update other fields as needed
            return usRepository.save(existingUs);
        }
        return null;
    }
    
    @Override
    public void deleteUs(Long usId) {
        // Add logic to delete a user
        usRepository.deleteById(usId);
    }
}
