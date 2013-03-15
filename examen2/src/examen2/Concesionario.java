package examen2;

import java.util.ArrayList;

import rutinas.Rutinas;

public class Concesionario {

	// Atributos
	private int _codigoConcesionario; // de 01 a 52
	private ArrayList<Modelos> _modelos = new ArrayList<Modelos>();
	@SuppressWarnings("rawtypes")
	private ArrayList _cantidad = new ArrayList();

	// Constructor vacío
//	private Concesionario(){
//		
//	}

	// Getters y setters
	
	public int get_codigoConcesionario() {
		return _codigoConcesionario;
	}
	public ArrayList<Modelos> get_modelos() {
		return _modelos;
	}
	@SuppressWarnings("rawtypes")
	public ArrayList get_cantidad() {
		return _cantidad;
	}
	public void set_codigoConcesionario(int _codigoConcesionario) {
		boolean error = true;
		while(true){
			error = false;
			if(_codigoConcesionario < 1 || _codigoConcesionario > 52){
				error = true;
			} else {
				this._codigoConcesionario = _codigoConcesionario;				
			}
		}
	}
	public void set_modelos(ArrayList<Modelos> _modelos) {
		this._modelos = _modelos;
	}
//	public void set_cantidad(ArrayList _cantidad) {
//		this._cantidad = _cantidad;
//	}
	
	// Pide los datos al usuario
	public void datos(Concesionarios concesionarios){
		int codigoConcesionario = -1;
		
		boolean error = true;
		
		while(error){
			error = false;
			codigoConcesionario = Rutinas.leeEntero("Introduce el codigo del concesionario: ");
			if(concesionarios.existeConcesionario(codigoConcesionario)){
				error = true;
				System.out.println("El codigo introducido ya existe");
			}
		}

		this.set_codigoConcesionario(codigoConcesionario);
		
		concesionarios.add(this);
	}
	
	public void addModelo(Modelo modelo){
		
	}
}