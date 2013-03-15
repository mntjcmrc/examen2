package examen2;

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
	
	
}