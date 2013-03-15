package examen2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Modelos {
	
	// Atributos
	private ArrayList<Modelo> _modelos = new ArrayList<Modelo>();
	
	// Constructor vacío
	public Modelos(){
		
	}

	// Getters y setters
	
	public ArrayList<Modelo> get_modelos() {
		return _modelos;
	}

//	private void set_modelos(ArrayList<Modelo> _modelos) {
//		this._modelos = _modelos;
//	}
	
	// Guarda el ArrayList de modelos en un archivo llamado "modelos.obj"
	public void guardar(){
		ArrayList<Modelo> modelos = this.get_modelos();
		if(modelos.size() == 0){
			System.out.println("No hay datos de concesionarios para guardar");
		} else {
			try {
				ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("modelos.obj"));
				salida.writeObject(modelos);
				salida.close();
				System.out.println("-- Modelos guardados con éxito --");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Carga el archivo "modelos.obj"
	@SuppressWarnings("unchecked")
	public void cargar() {
		File f = new File("modelos.obj");
		if (f.exists()) {
			try {
				ObjectInputStream entrada = new ObjectInputStream(
						new FileInputStream("modelos.obj"));
				this._modelos = (ArrayList<Modelo>) entrada.readObject();
				entrada.close();
				System.out.println("-- Modelos cargados con éxito --");
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("El fichero no existe");
		}
	}
}