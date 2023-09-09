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
import java.util.Random;
public class Cliente{
    private Random random;
    private String nombre, DPI;
    private long factura;
    private int pagar;
    private ArrayList<Dispositivo> dispositivos;

    public Cliente(String nombre, String DPI){
        this.nombre = nombre;
        this.DPI = DPI;
        this.dispositivos=null;
    }
    
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getDPI(){return DPI;}
    public void setDPI(String DPI){this.DPI = DPI;}

    public ArrayList<Dispositivo> getDispositivos(){return dispositivos;}
    public void addDispositivo(Dispositivo dispositivoNuevo){
        dispositivos.add(dispositivoNuevo);
    }

    public void generarFactura(){
        factura = random.nextLong(1,28001) + random.nextLong(0,15000) + random.nextLong(0,15000); // genera numero de factura
        for(Dispositivo i : dispositivos){pagar += i.getCosto(); System.out.println(i.toString()+"___ Q" + i.getCosto());} // recoge todos los servicios y suma el total
        System.out.printf("Total a pagar en factura #%d: %d",factura, pagar);
    }
    

}