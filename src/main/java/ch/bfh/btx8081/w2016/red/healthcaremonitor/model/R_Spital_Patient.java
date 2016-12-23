package ch.bfh.btx8081.w2016.red.healthcaremonitor.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class R_Spital_Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
	@OneToMany
    @JoinColumn(name="pk_id")
    private Status fk_Status;
		
	@OneToMany
    @JoinColumn(name="pk_id")
    private Spital fk_Spital;
	
	@OneToMany
    @JoinColumn(name="pk_id")
    private Patient fk_Patient;
	
	@Temporal(TemporalType.DATE)
    private Date behandlungsbegin;
	
	@Temporal(TemporalType.DATE)
    private Date behandlungsende;

	public int getPk_id() {
		return pk_id;
	}

	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}

	public Status getFk_Status() {
		return fk_Status;
	}

	public void setFk_Status(Status fk_Status) {
		this.fk_Status = fk_Status;
	}

	public Spital getFk_Spital() {
		return fk_Spital;
	}

	public void setFk_Spital(Spital fk_Spital) {
		this.fk_Spital = fk_Spital;
	}

	public Patient getFk_Patient() {
		return fk_Patient;
	}

	public void setFk_Patient(Patient fk_Patient) {
		this.fk_Patient = fk_Patient;
	}

	public Date getBehandlungsbegin() {
		return behandlungsbegin;
	}

	public void setBehandlungsbegin(Date behandlungsbegin) {
		this.behandlungsbegin = behandlungsbegin;
	}

	public Date getBehandlungsende() {
		return behandlungsende;
	}

	public void setBehandlungsende(Date behandlungsende) {
		this.behandlungsende = behandlungsende;
	}
	
	
	
}
