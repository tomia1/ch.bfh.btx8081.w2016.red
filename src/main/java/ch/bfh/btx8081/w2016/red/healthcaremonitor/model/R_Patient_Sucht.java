package ch.bfh.btx8081.w2016.red.healthcaremonitor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "R_Patient_Sucht")
public class R_Patient_Sucht {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pk_id")
    private Patient fk_Patient;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pk_id")
    private Status fk_Status;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pk_id")
    private Sucht fk_Sucht;
	
	@Temporal(TemporalType.DATE)
    private Date suchtbegin;
	
	@Temporal(TemporalType.DATE)
    private Date suchtende;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pk_id")
    private Suchttyp fk_Suchttyp;

	public int getPk_id() {
		return pk_id;
	}

	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}

	public Patient getFk_Patient() {
		return fk_Patient;
	}

	public void setFk_Patient(Patient fk_Patient) {
		this.fk_Patient = fk_Patient;
	}

	public Status getFk_Status() {
		return fk_Status;
	}

	public void setFk_Status(Status fk_Status) {
		this.fk_Status = fk_Status;
	}

	public Sucht getFk_Sucht() {
		return fk_Sucht;
	}

	public void setFk_Sucht(Sucht fk_Sucht) {
		this.fk_Sucht = fk_Sucht;
	}

	public Date getSuchtbegin() {
		return suchtbegin;
	}

	public void setSuchtbegin(Date suchtbegin) {
		this.suchtbegin = suchtbegin;
	}

	public Date getSuchtende() {
		return suchtende;
	}

	public void setSuchtende(Date suchtende) {
		this.suchtende = suchtende;
	}

	public Suchttyp getFk_Suchttyp() {
		return fk_Suchttyp;
	}

	public void setFk_Suchttyp(Suchttyp fk_Suchttyp) {
		this.fk_Suchttyp = fk_Suchttyp;
	}
	
	

}
