package com.Solution.in.service;

import java.util.List;

import com.Solution.in.model.Claim;

public interface ClaimService {
    Claim createClaim(Claim claim);
    Claim getClaimById(Long claimId);
    List<Claim> getAllClaims();
    Claim updateClaim(Long claimId, Claim claim);
    void deleteClaim(Long claimId);
}
