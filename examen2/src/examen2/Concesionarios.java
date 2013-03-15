package examen2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	
	// Guarda el ArrayList de modelos en un archivo llamado "concesionarios.obj"
	public void guardar(){
		ArrayList<Concesionario> modelos = this.get_concesionarios();
		if(modelos.size() == 0){
			System.out.println("No hay datos de concesionarios para guardar");
		} else {
			try {
				ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("concesionarios.obj"));
				salida.writeObject(modelos);
				salida.close();
				System.out.println("-- Concesionarios guardados con éxito --");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Carga el archivo "concesionarios.obj"
	@SuppressWarnings("unchecked")
	public void cargar() {
		File f = new File("concesionarios.obj");
		if (f.exists()) {
			try {
				ObjectInputStream entrada = new ObjectInputStream(
						new FileInputStream("concesionarios.obj"));
				this._concesionarios = (ArrayList<Concesionario>) entrada.readObject();
				entrada.close();
				System.out.println("-- Concesionarios cargados con éxito --");
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("El fichero no existe");
		}
	}
	
}
