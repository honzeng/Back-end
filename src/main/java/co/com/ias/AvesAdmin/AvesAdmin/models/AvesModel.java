package co.com.ias.AvesAdmin.AvesAdmin.models;

public class AvesModel {
	private String cdave;
	private String dsnombre_comun;
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
	public AvesModel(String cdave, String dsnombre_comun, String dsnombre_cientifico) {
		super();
		this.cdave = cdave;
		this.dsnombre_comun = dsnombre_comun;
		this.dsnombre_cientifico = dsnombre_cientifico;
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
