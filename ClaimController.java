package com.Solution.in.controller;



import com.Solution.in.model.Claim;
import com.Solution.in.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {
    private final ClaimService claimService;

    @Autowired
    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping
    public List<Claim> getAllClaims() {
        return claimService.getAllClaims();
    }

    @GetMapping("/{id}")
    public Claim getClaimById(@PathVariable("id") Long id) {
        return claimService.getClaimById(id);
    }

    @PostMapping
    public Claim createClaim(@RequestBody Claim claim) {
        return claimService.createClaim(claim);
    }

    @PutMapping("/{id}")
    public Claim updateClaim(@PathVariable("id") Long id, @RequestBody Claim claim) {
        return claimService.updateClaim(id, claim);
    }

    @DeleteMapping("/{id}")
    public void deleteClaim(@PathVariable("id") Long id) {
        claimService.deleteClaim(id);
    }
}
