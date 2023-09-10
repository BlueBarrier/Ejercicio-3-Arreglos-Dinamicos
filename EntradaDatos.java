/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @description: Clase para entrada de datos 
 * @version: 1.0
 * @fechaCreacion: 9/09/2023
 * @fechaMod: 09/09/2023
 */
import java.util.Scanner;
public class EntradaDatos {
    private Scanner scanner;
    // para la clase Cliente
    public String pedirNombre(){System.out.println("Ingrese su nombre: "); return scanner.nextLine();} // pedir nombre
    public String pedirDPI(){System.out.println("Ingrese su DPI: "); return scanner.nextLine();} // pedir DPI
    
    // para la clase Dispositivo
    public String pedirTipo(){
        System.out.println("Ingrese el tipo de dispositivo a realizar servicio (Teléfono, Tablet, Computadora, TV, Consola de Videojuegos): ");
        return scanner.nextLine();
    }
    public String pedirFabricante(){System.out.println("Ingrese el nombre del fabricante: "); return scanner.nextLine();}
    
    // para la clase Servicio
    public String ingresarFecha(){
        System.out.println("Ingrese la fecha del servicio utilizando el siguiente formato (dd/mm/aa): ");
        return scanner.nextLine();
    }
    public int elegirServicio(){
        System.out.println("Seleccione el número de servicio deseado: "+
                                "1.Reparación de pantalla"+
                                "2.Incremento de memoria"+
                                "3.Reparación hardware"+
                                "4.Reparación software"+
                                "5.Reparación batería");
        return scanner.nextInt();
    }


    
}
