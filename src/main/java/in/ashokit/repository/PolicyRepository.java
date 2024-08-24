package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer>{
	
	public Policy findById(int id);
	

}
