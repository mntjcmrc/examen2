package examen2;

import rutinas.Rutinas;

public class Modelo {
	
	// Atributos
	private int _codigoModelo;
	private String _descripcion;
	private float _pvp;

	// Constructor vacío
	public Modelo(){
		
	}

	// Getters y setters
	
	public int get_codigoModelo() {
		return _codigoModelo;
	}

	public String get_descripcion() {
		return _descripcion;
	}

	public float get_pvp() {
		return _pvp;
	}

	public void set_codigoModelo(int _codigoModelo) {
		this._codigoModelo = _codigoModelo;
	}

	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	public void set_pvp(float _pvp) {
		this._pvp = _pvp;
	}
	
	
	
	@Override
	public String toString() {
		return "Codigo modelo: " + get_codigoModelo() + "\nDescripcion: "
				+ get_descripcion() + "\nPVP: " + get_pvp() + "\n";
	}

	// Pide los datos al usuario
	public void datos(Modelos modelos){
		int codigoModelo = -1;
		String descripcion = "";
		float pvp = 0;
		
		boolean error = true;
		
		while(error){
			error = false;
			codigoModelo = Rutinas.leeEntero("Introduce el codigo del modelo: ");
			if(modelos.existeModelo(codigoModelo)){
				error = true;
				System.out.println("El codigo introducido ya existe");
			}
		}
		descripcion = Rutinas.leeString("Introduce la descripción del modelo: ");
		pvp = Rutinas.leeFloat("Introduce el precio del modelo: ");
		
		this.set_codigoModelo(codigoModelo);
		this.set_descripcion(descripcion);
		this.set_pvp(pvp);
		
		modelos.add(this);
	}

	
}