package ch.bfh.btx8081.w2016.red.healthcaremonitor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Geschlecht")
public class Geschlecht {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
	private String geschlecht;

	public int getPk_id() {
		return pk_id;
	}

	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	
}
