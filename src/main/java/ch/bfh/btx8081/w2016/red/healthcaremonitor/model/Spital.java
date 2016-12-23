package ch.bfh.btx8081.w2016.red.healthcaremonitor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Spital")
public class Spital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
    private String name;
    private double cw;
    
    @OneToMany
    @JoinColumn(name="pk_id")
    private Kanton fk_Kanton;

	public int getPk_id() {
		return pk_id;
	}

	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCw() {
		return cw;
	}

	public void setCw(double cw) {
		this.cw = cw;
	}

	public Kanton getFk_Kanton() {
		return fk_Kanton;
	}

	public void setFk_Kanton(Kanton fk_Kanton) {
		this.fk_Kanton = fk_Kanton;
	}
    
    
}
