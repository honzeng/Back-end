package co.com.ias.AvesAdmin.AvesAdmin.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Aves")
public class Aves implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cdave;
	@NotNull
	private String dsnombre_comun;
	@NotNull
	private String dsnombre_cientifico;
	

	public String getCdave() {
		return cdave;
	}
	public void setCdave(String cdave) {
		this.cdave = cdave;
	}
	public String getDsnombre_comun() {
		return dsnombre_comun;
	}
	public void setDsnombre_comun(String dsnombre_comun) {
		this.dsnombre_comun = dsnombre_comun;
	}
	public String getDsnombre_cientifico() {
		return dsnombre_cientifico;
	}
	public void setDsnombre_cientifico(String dsnombre_cientifico) {
		this.dsnombre_cientifico = dsnombre_cientifico;
	}
}
