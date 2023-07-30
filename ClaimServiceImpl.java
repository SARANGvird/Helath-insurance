package com.Solution.in.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Solution.in.model.Claim;
import com.Solution.in.repository.ClaimRepository;
import com.Solution.in.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
    private final ClaimRepository claimRepository;
    
    public ClaimServiceImpl(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }
    
    @Override
    public Claim createClaim(Claim claim) {
        // Add logic to create a new claim
        return claimRepository.save(claim);
    }
    
    @Override
    public Claim getClaimById(Long claimId) {
        // Add logic to get a claim by ID
        return claimRepository.findById(claimId).orElse(null);
    }
    
    @Override
    public List<Claim> getAllClaims() {
        // Add logic to get all claims
        return claimRepository.findAll();
    }
    
    @Override
    public Claim updateClaim(Long claimId, Claim claim) {
        // Add logic to update a claim
        Claim existingClaim = claimRepository.findById(claimId).orElse(null);
        if (existingClaim != null) {
            existingClaim.setStatus(claim.getStatus());
            existingClaim.setAmount(claim.getAmount());
            // Update other fields as needed
            return claimRepository.save(existingClaim);
        }
        return null;
    }
    
    @Override
    public void deleteClaim(Long claimId) {
        // Add logic to delete a claim
        claimRepository.deleteById(claimId);
    }
}
