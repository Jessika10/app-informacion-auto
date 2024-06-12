// Declara una clase llamada Auto.
public class Auto { 

    // Declara una variable de instancia de tipo String llamada 'marca'.
	private String marca; 
	// Declara una variable de instancia de tipo String llamada 'modelo'.
	private String modelo; 
	// Declara una variable de instancia de tipo int llamada 'cilindrada'.
	private int cilindrada; 
	// Declara una variable de instancia de tipo int llamada 'tipoCombustible'.
	private int tipoCombustible; 
	// Declara una variable de instancia de tipo int llamada 'capacidadEnPasajero'.
	private int capacidadEnPasajero; 
	
	// Declara un constructor sin argumentos para la clase Auto.
	public Auto(){ 
	    // Inicializa la variable 'marca' con una cadena vacía.
		this.marca = ""; 
		// Inicializa la variable 'modelo' con una cadena vacía.
		this.modelo = ""; 
		// Inicializa la variable 'cilindrada' con el valor 0.
		this.cilindrada = 0; 
		// Inicializa la variable 'tipoCombustible' con el valor 0.
		this.tipoCombustible = 0; 
		// Inicializa la variable 'capacidadEnPasajero' con el valor 0.
		this.capacidadEnPasajero = 0; 
	}
		
	// Declara un método público llamado 'setMarca' que recibe un parámetro de tipo String llamado 'marca'.	
	public void setMarca(String marca){ 
		// Asigna el valor del parámetro 'marca' a la variable 'marca' de la instancia actual.
		this.marca = marca; 
	}
	// Declara un método público llamado 'getMarca' que devuelve un valor de tipo String.
	public String getMarca(){
       // Devuelve el valor de la variable 'marca' de la instancia actual.		
	   return this.marca; 
	}
	// Declara un método público llamado 'setModelo' que recibe un parámetro de tipo String llamado 'modelo'.
	public void setModelo(String modelo){
        // Asigna el valor del parámetro 'modelo' a la variable 'modelo' de la instancia actual.		
		this.modelo = modelo; 
	}
	// Declara un método público llamado 'getModelo' que devuelve un valor de tipo String.
	public String getModelo(){
		// Devuelve el valor de la variable 'modelo' de la instancia actual.
		return this.modelo; 
	}
	// Declara un método público llamado 'setCilindrada' que recibe un parámetro de tipo int llamado 'cilindrada'.
	public void setCilindrada(int cilindrada){
		// Asigna el valor del parámetro 'cilindrada' a la variable 'cilindrada' de la instancia actual.
		this.cilindrada = cilindrada; 
	}
	// Declara un método público llamado 'getCilindrada' que devuelve un valor de tipo int.
	public int getCilindrada(){ 
		// Devuelve el valor de la variable 'cilindrada' de la instancia actual.
		return this.cilindrada; 
	}
	// Declara un método público llamado 'setTipoCombustible' que recibe un parámetro de tipo int llamado 'tipoCombustible'.
	public void setTipoCombustible(int tipoCombustible){
	// Asigna el valor del parámetro 'tipoCombustible' a la variable 'tipoCombustible' de la instancia actual.		
		this.tipoCombustible = tipoCombustible; 
	}
	// Declara un método público llamado 'getTipoCombustible' que devuelve un valor de tipo int.
	public int getTipoCombustible(){ 
		// Devuelve el valor de la variable 'tipoCombustible' de la instancia actual.
		return this.tipoCombustible; 
	}
	// Declara un método público llamado 'setCapacidadEnPasajero' que recibe un parámetro de tipo int llamado 'capacidadEnPasajero'.
	public void setCapacidadEnPasajero(int capacidadEnPasajero){
		// Asigna el valor del parámetro 'capacidadEnPasajero' a la variable 'capacidadEnPasajero' de la instancia actual.
		this.capacidadEnPasajero = capacidadEnPasajero; 
	}
	// Declara un método público llamado 'getCapacidadEnPasajero' que devuelve un valor de tipo int.
	public int getCapacidadEnPasajero(){ 
		// Devuelve el valor de la variable 'capacidadEnPasajero' de la instancia actual.
		return this.capacidadEnPasajero; 
	}
}
