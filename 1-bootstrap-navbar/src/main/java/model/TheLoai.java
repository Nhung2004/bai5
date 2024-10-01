package model;

public class TheLoai {
	private String matacgia;
	private String tentacgia;
	public TheLoai(String matacgia, String tentacgia) {
		super();
		this.matacgia = matacgia;
		this.tentacgia = tentacgia;
	}
	public TheLoai() {
		super();
	}
	public String getMatacgia() {
		return matacgia;
	}
	public void setMatacgia(String matacgia) {
		this.matacgia = matacgia;
	}
	public String getTentacgia() {
		return tentacgia;
	}
	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}
	

}
