package com.Solution.in.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Solution.in.model.Policy;
import com.Solution.in.repository.PolicyRepository;
import com.Solution.in.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
    private final PolicyRepository policyRepository;
    
    public PolicyServiceImpl(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }
    
    @Override
    public Policy createPolicy(Policy policy) {
        // Add logic to create a new policy
        return policyRepository.save(policy);
    }
    
    @Override
    public Policy getPolicyById(Long policyId) {
        // Add logic to get a policy by ID
        return policyRepository.findById(policyId).orElse(null);
    }
    
    @Override
    public List<Policy> getAllPolicies() {
        // Add logic to get all policies
        return policyRepository.findAll();
    }
    
    @Override
    public Policy updatePolicy(Long policyId, Policy policy) {
        // Add logic to update a policy
        Policy existingPolicy = policyRepository.findById(policyId).orElse(null);
        if (existingPolicy != null) {
            existingPolicy.setHolderName(policy.getHolderName());
            existingPolicy.setDescription(policy.getDescription());
            // Update other fields as needed
            return policyRepository.save(existingPolicy);
        }
        return null;
    }
    
    @Override
    public void deletePolicy(Long policyId) {
        // Add logic to delete a policy
        policyRepository.deleteById(policyId);
    }
}
