package in.ashokit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Policy {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int pid;
	private String pname;
	private String pcity;
	private String amount;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
