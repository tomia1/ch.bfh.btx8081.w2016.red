package ch.bfh.btx8081.w2016.red.healthcaremonitor.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
	private String status;

	public int getPk_id() {
		return pk_id;
	}

	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
