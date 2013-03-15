package examen2;

public class ModeloPromocionado extends Modelo {

	// Atributos
	private float _descuento;
	
	// Constructor vacío
	public ModeloPromocionado(){
		
	}

	// Getters y setters
	
	public float get_descuento() {
		return _descuento;
	}

	public void set_descuento(float _descuento) {
		this._descuento = _descuento;
	}

	@Override
	public String toString() {
		return super.toString() + "Descuento: " + get_descuento() + "\n" ;
	}
	
}