package co.com.ias.AvesAdmin.AvesAdmin.models;

public class PaisesModel {
	
	private String cdPais;
	private String dsNombre;
	private String cdZona;
	
	public PaisesModel(String cdPais, String dsNombre, String cdZona) {
		super();
		this.cdPais = cdPais;
		this.dsNombre = dsNombre;
		this.cdZona = cdZona;
	}
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
	public String getCdZona() {
		return cdZona;
	}
	public void setCdZona(String cdZona) {
		this.cdZona = cdZona;
	}

}
