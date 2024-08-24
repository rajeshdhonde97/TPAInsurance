package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Policy;
import in.ashokit.service.PolicyService;

@RestController
public class PolicyController {

	@Autowired
	private PolicyService policyService;

	@PostMapping(value="/savePolicy",consumes = {"application/Json"},produces = "application/Json")
	public Policy savePolicyData(@RequestBody Policy policy) {
		Policy saveInsurancePolicy1 = policyService.saveInsurancePolicy(policy);
		return saveInsurancePolicy1;
	}

	@GetMapping("/allPolicies")
	public List<Policy> getAllPolicies() {
		List<Policy> allPolicies = policyService.getAllPolicies();
		return allPolicies;
	}
	
	@PutMapping("/updatePolicy/{id}")
	public Policy updatePolicy(@RequestBody Policy policy,@PathVariable int id) {
		Policy updatePolicy = policyService.updatePolicy(policy, id);
		return updatePolicy;
	}
	
	@GetMapping(value={"/getById/{id}"},produces={"application/Json","application/xml"})
	public Policy getById(@PathVariable int id) {
		Policy byId = policyService.getById(id);
		return byId;
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		policyService.deleteById(id);
		return " Id "+ id +" deleted successfully..";
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllPolicies(){
		policyService.deleteAllPolicies();
		return "All deleted";
	}
	
	@PostMapping("/saveAll")
	public List<Policy> saveMultiple(@RequestBody List<Policy> policy){
		List<Policy> saveMultiple = policyService.saveMultiple(policy);
		return saveMultiple;
	}

}
