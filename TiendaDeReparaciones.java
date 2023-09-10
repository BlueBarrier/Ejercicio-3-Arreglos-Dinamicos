/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @description: main
 * @version: 1.0
 * @fechaCreacion: 9/09/2023
 * @fechaMod: 09/09/2023
 */
import java.util.Scanner;
public class TiendaDeReparaciones {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TiendaManager tienda = new TiendaManager();
        System.out.println("BIENVENIDO A TECHGT");
        do{
            tienda.opcion();
        }while(!tienda.salirTienda());
        sc.close();
    }
}
