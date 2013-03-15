package examen2;

import java.util.ArrayList;

public class Concesionarios {

	// Atributos
	private ArrayList<Concesionario> _concesionarios = new ArrayList<Concesionario>();
	
	// Constructor vacío
	public Concesionarios(){
		
	}

	// Getters y setters
	
	public ArrayList<Concesionario> get_concesionarios() {
		return _concesionarios;
	}

	public void set_concesionarios(ArrayList<Concesionario> _concesionarios) {
		this._concesionarios = _concesionarios;
	}
	
}
