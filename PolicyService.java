package com.Solution.in.service;

import java.util.List;

import com.Solution.in.model.Policy;

public interface PolicyService {
    Policy createPolicy(Policy policy);
    Policy getPolicyById(Long policyId);
    List<Policy> getAllPolicies();
    Policy updatePolicy(Long policyId, Policy policy);
    void deletePolicy(Long policyId);
}
