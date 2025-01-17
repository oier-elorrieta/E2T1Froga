package Modelo.POJO;

public class Ikaslea {
	private int idIkasle;
	private String izena;
	public Ikaslea(int idIkasle, String izena) {
		
		this.idIkasle = idIkasle;
		this.izena = izena;
	}
	public int getIdIkasle() {
		return idIkasle;
	}
	public void setIdIkasle(int idIkasle) {
		this.idIkasle = idIkasle;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}

}
