package com.Solution.in.model;

import java.util.UUID;

public class ClaimNumberGenerator {
    public static String generateClaimNumber() {
        String prefix = "CLAIM-";
        String uniqueId = UUID.randomUUID().toString().substring(0, 8); // Generate a unique identifier
        
        return prefix + uniqueId;
    }
}
