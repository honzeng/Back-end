package co.com.ias.AvesAdmin.AvesAdmin.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "tont_paises")
public class Paises implements Serializable {

	@Id
	private String cdPais;
	@NotNull
	private String dsNombre;
	@ManyToOne(fetch = FetchType.EAGER)
	private Zonas Zonas;
	public String getCdPais() {
		return cdPais;
	}
	public void setCdPais(String cdPais) {
		this.cdPais = cdPais;
	}
	public String getDsNombre() {
		return dsNombre;
	}
	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}

}
