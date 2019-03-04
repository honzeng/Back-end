package co.com.ias.AvesAdmin.AvesAdmin.models;

public class ZonasModel {

	private String cdZona;
	private String dsNombre;
	
	public ZonasModel(String cdZona, String dsNombre) {
		super();
		this.cdZona = cdZona;
		this.dsNombre = dsNombre;
	}
	public String getCdZona() {
		return cdZona;
	}
	public void setCdZona(String cdZona) {
		this.cdZona = cdZona;
	}
	public String getDsNombre() {
		return dsNombre;
	}
	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}
	
	
}
