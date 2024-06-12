
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Auto auto = new Auto();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingreso de los datos del auto: ");
		System.out.println("Marca: ");
		auto.setMarca(scanner.nextLine());
		System.out.println("Modelo: ");
		auto.setModelo(scanner.nextLine());
		System.out.println("Cilindrada: ");
		auto.setCilindrada(scanner.nextInt());
		System.out.println("Tipo de combustible: ");
		auto.setTipoCombustible(scanner.nextInt());
		System.out.println("Capacidad de pasajeros: ");
		auto.setCapacidadEnPasajero(scanner.nextInt());
		
		
		System.out.println("Datos de salida: ");
		System.out.println("La marca que ha ingresado es: " + auto.getMarca());
		System.out.println("El modelo que ha ingresado es: " + auto.getModelo());
		System.out.println("La cilindrada que ha ingresado es: " + auto.getCilindrada());
		System.out.println("El tipo de combustible es: " + auto.getTipoCombustible());
		System.out.println("Tiene una capacidad de " + auto.getCapacidadEnPasajero() + " pasajeros.");
	}
}

// Importa la clase Scanner del paquete java.util, que se utiliza para leer la entrada del lo que se ingresa por el teclado.
import java.util.Scanner; 

// Declara una clase llamada Main.
public class Main { 
    // Declara el método main, punto de entrada del programa.
    public static void main(String[] args) { 
        // Crea una nueva instancia de la clase Auto y la asigna a la variable 'auto'.
        Auto auto = new Auto(); 
		// Crea una nueva instancia de la clase Scanner para leer la entrada del teclado.
        Scanner scanner = new Scanner(System.in); 

		// Imprime un mensaje en la consola.
        System.out.println("Ingreso de los datos del auto: ");
		// Imprime un mensaje en la consola solicitando la marca del auto.		
        System.out.println("Marca: "); 
		// Lee lo ingresado por el teclado y la asigna como marca del auto.
        auto.setMarca(scanner.nextLine());
		// Imprime un mensaje en la consola solicitando el modelo del auto.		
        System.out.println("Modelo: "); 
		// Lee lo ingresado por el teclado y la asigna como modelo del auto.
        auto.setModelo(scanner.nextLine()); 
		// Imprime un mensaje en la consola solicitando la cilindrada del auto.
        System.out.println("Cilindrada: "); 
		// Lee lo ingresado por el teclado y la asigna como cilindrada del auto.
        auto.setCilindrada(scanner.nextInt()); 
        // Imprime un mensaje en la consola solicitando el tipo de combustible del auto.
		System.out.println("Tipo de combustible: "); 
		// Lee lo ingresado por el teclado y la asigna como tipo de combustible del auto.
        auto.setTipoCombustible(scanner.nextInt()); 
		// Imprime un mensaje en la consola solicitando la capacidad de pasajeros del auto.
        System.out.println("Capacidad de pasajeros: "); 
		// Lee lo ingresado por el teclado y la asigna como capacidad de pasajeros del auto.
        auto.setCapacidadEnPasajero(scanner.nextInt()); 
        
        // Imprime un mensaje en la consola.
        System.out.println("Datos de salida: "); 
		// Imprime la marca del auto ingresada por el usuario.
        System.out.println("La marca que ha ingresado es: " + auto.getMarca()); 
		// Imprime el modelo del auto ingresado por el usuario.
        System.out.println("El modelo que ha ingresado es: " + auto.getModelo()); 
		// Imprime la cilindrada del auto ingresada por el usuario.
        System.out.println("La cilindrada que ha ingresado es: " + auto.getCilindrada());
		// Imprime el tipo de combustible del auto ingresado por el usuario.
        System.out.println("El tipo de combustible es: " + auto.getTipoCombustible()); 
		// Imprime la capacidad de pasajeros del auto ingresada por el usuario.
        System.out.println("Tiene una capacidad de " + auto.getCapacidadEnPasajero() + " pasajeros."); 
    }
}


/* javac Main.java
 - genera los .class
java Main
 - Ejecuta el programa
*/