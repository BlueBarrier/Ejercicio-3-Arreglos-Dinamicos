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
import java.util.ArrayList;
import java.util.Scanner;
public class EntradaDatos {
    private Scanner scanner = new Scanner(System.in);
    // para la clase Cliente
    public String pedirNombre(){
        System.out.println("Ingrese su nombre: "); 
        String nombre = scanner.nextLine();
        return nombre;
    } // pedir nombre
    public String pedirDPI(){System.out.println("Ingrese su DPI: "); String DPI=scanner.nextLine(); return DPI;} // pedir DPI
    
    // para la clase Dispositivo
    public String pedirTipo(){
        System.out.println("Ingrese el tipo de dispositivo a realizar servicio (Teléfono, Tablet, Computadora, TV, Consola de Videojuegos): ");
        String tipo = scanner.nextLine(); 
        return tipo;
    }
    public String pedirFabricante(){System.out.println("Ingrese el nombre del fabricante: "); String fabri = scanner.nextLine(); return fabri;}
    
    // para la clase Servicio
    public String ingresarFecha(){
        System.out.println("Ingrese la fecha del servicio utilizando el siguiente formato (dd/mm/aa): ");
       String fecha = scanner.nextLine();
        return fecha;
    }
    public int elegirServicio(){
        System.out.println("Seleccione el número de servicio deseado: "+
                                "\n1.Reparación de pantalla"+
                                "\n2.Incremento de memoria"+
                                "\n3.Reparación hardware"+
                                "\n4.Reparación software"+
                                "\n5.Reparación batería");
        
        int opcion = scanner.nextInt();
        return opcion;
    }

    // para la clase TiendaManager
    public int pedirOpcionMenu(){
        System.out.println("\nSeleccione el número de operación que desee realizar"+
                                "\n1.Nuevo Cliente"+
                                "\n2.Agregar nuevo Dispositivo a X Cliente"+
                                "\n3.Agregar nuevo Servicio a Dispositivo de X Cliente"+
                                "\n4.Mostrar Estadísticas"+
                                "\n5.Finalizar reparaciones"+
                                "\n6.Salir");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }
    public String pedirCliente(ArrayList<String>listaTemp){
        int contador = 1;
        int index=0;
        System.out.println("Seleccione el número del cliente:");
        for(String i: listaTemp){
            System.out.printf("\n%d %s.",contador,i);
            contador++;
        }
        index = scanner.nextInt();
        scanner.nextLine();
        return listaTemp.get(index-1);
    }
    public String pedirDispositivo(ArrayList<String>listaTemp){
        int contador = 1;
        int index=0;
        System.out.println("Seleccione el número del dispositivo:");
        for(String i: listaTemp){
            System.out.printf("\n%d %s.",contador,i);
            contador++;
        }
        index = scanner.nextInt();
        scanner.nextLine();
        return listaTemp.get(index-1);
    }
    
    public int pedirInicioMes(){
        System.out.println("Ingrese el mes inicial en dígitos de forma 00: \n");
        int mes = scanner.nextInt();
        scanner.nextLine();
        return mes;
    }

    public int pedirFinMes(){
        System.out.println("Ingrese el mes final en dígitos de forma 00: \n");
        int mes = scanner.nextInt();
        scanner.nextLine();
        return mes;
    }

    public int pedirOpcionStats(){
        System.out.println("\n Seleccione el número de estadística que quiera ver: "+
                                "\n1. Fabricantes comunes"+
                                "\n2. Servicios comunes"+
                                "\n3. Ingresos por fecha");
        int opi = scanner.nextInt();
        scanner.nextLine();
        return opi;
    }

}
