package co.com.ias.AvesAdmin.AvesAdmin.models;

public class AvesPaisModel {

	private String cdPais;
	private String cdAve;
	public String getCdPais() {
		return cdPais;
	}
	public AvesPaisModel(String cdPais, String cdAve) {
		super();
		this.cdPais = cdPais;
		this.cdAve = cdAve;
	}
	public void setCdPais(String cdPais) {
		this.cdPais = cdPais;
	}
	public String getCdAve() {
		return cdAve;
	}
	public void setCdAve(String cdAve) {
		this.cdAve = cdAve;
	}
	
	
}
