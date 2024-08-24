package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.exception.PolicyNotFoundException;
import in.ashokit.model.Policy;
import in.ashokit.repository.PolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;

	//save the policy
	public Policy saveInsurancePolicy(Policy policy) {
		Policy savePolicy = policyRepository.save(policy);
		return savePolicy;
	}
	
	//Get all the policies
	public List<Policy> getAllPolicies(){
		List<Policy> policies = policyRepository.findAll();
		return policies;
	}
	
	//update the Policy
	public Policy updatePolicy(Policy policy,int id) {
		Policy updatePolicy = policyRepository.findById(id);
		updatePolicy.setPname(policy.getPname());
		updatePolicy.setPcity(policy.getPcity());
		updatePolicy.setAmount(policy.getAmount());
		policyRepository.save(policy);
		return updatePolicy;	
	}
	
	//find Policy By Id
	public Policy getById(int id) {
		Policy findById = policyRepository.findById(id);
		if(findById==null) {
			throw new PolicyNotFoundException("Policy Id Not Found");
		}
		return findById;
	}
	
	//Delete By Id
	public void deleteById(int id) {
		policyRepository.findById(id);
		policyRepository.deleteById(id);
	}
	
	//Delete All Policies
	public void deleteAllPolicies(){
		policyRepository.findAll();
		policyRepository.deleteAll();
	}
	
	//save Multiple Policies
	public List<Policy> saveMultiple(List<Policy> policy){
		List<Policy> saveAll = policyRepository.saveAll(policy);
		return saveAll;	
	}
	
}
