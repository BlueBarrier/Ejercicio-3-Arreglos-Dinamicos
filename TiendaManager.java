/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @description: driverprogram
 * @version: 1.0
 * @fechaCreacion: 9/09/2023
 * @fechaMod: 09/09/2023
 */
import java.util.Scanner;
public class TiendaManager {
    private Scanner sc = new Scanner(System.in);
    private EntradaDatos entradaDatos;

    public void nuevaVenta(){
        Cliente cliente = new Cliente(entradaDatos.pedirNombre(), entradaDatos.pedirDPI());
        cliente.addDispositivo(new Dispositivo(cliente, entradaDatos.pedirTipo(), entradaDatos.pedirFabricante()));
        cliente.getDispositivos().get(0).addServicios(new Servicio(entradaDatos.ingresarFecha()));
        cliente.getDispositivos().get(0).getServicios().get(0).elegirServicio(entradaDatos.elegirServicio());
        sc.close();
    }
    public int opcion(){
        return 0;
    }
 
}
