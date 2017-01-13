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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_id;
	
	@Temporal(TemporalType.DATE)
    private Date geburtsdatum;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="fk_geschlecht", referencedColumnName="pk_id")
	private Geschlecht fk_geschlecht;
	
	private double gewichtkg;

	public int getPk_id() {
		return pk_id;
	}

	public void setPk_id(int pk_id) {
		this.pk_id = pk_id;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public Geschlecht getFk_geschlecht() {
		return fk_geschlecht;
	}

	public void setFk_geschlecht(Geschlecht fk_geschlecht) {
		this.fk_geschlecht = fk_geschlecht;
	}

	public double getGewichtkg() {
		return gewichtkg;
	}

	public void setGewichtkg(double gewichtkg) {
		this.gewichtkg = gewichtkg;
	}
	
	
	
	
}
