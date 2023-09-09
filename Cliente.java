/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @description: Clase tipo cliente, almacena información del cliente
 * @version: 1.0
 * @fechaCreacion: 9/09/2023
 * @fechaMod: 09/09/2023
 */
import java.util.ArrayList;
public class Cliente{
    private String nombre, DPI;
    private ArrayList<Dispositivo> dispositivos;

    public Cliente(String nombre, String DPI){
        this.nombre = nombre;
        this.DPI = DPI;
        this.dispositivos=null;
    }
    
    

}