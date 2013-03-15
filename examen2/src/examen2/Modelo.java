package examen2;

public class Modelo {
	
	// Atributos
	private int codigoModelo;
	private String descripcion;
	private float pvp;

	// Constructor vacío
	public Modelo(){
		
	}

	// Getters y setters
	
	public int getCodigoModelo() {
		return codigoModelo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public float getPvp() {
		return pvp;
	}

	public void setCodigoModelo(int codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
	
	
}