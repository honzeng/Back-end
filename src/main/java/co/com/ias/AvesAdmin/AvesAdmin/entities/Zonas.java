package co.com.ias.AvesAdmin.AvesAdmin.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tont_zonas")
public class Zonas implements Serializable {
	
	@Id
	private String cdZona;
	@NotNull
	private String dsnombre;
	
	public String getCdZona() {
		return cdZona;
	}
	public void setCdZona(String cdZona) {
		this.cdZona = cdZona;
	}
	public String getDsnombre() {
		return dsnombre;
	}
	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}
	

}
