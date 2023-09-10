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
import java.util.ArrayList;
public class TiendaManager {
    private Scanner sc = new Scanner(System.in);
    private EntradaDatos entradaDatos;
    boolean condicion = false;
    private ArrayList<Cliente> clientes;
    

    public void nuevaVenta(){
        Cliente cliente = new Cliente(entradaDatos.pedirNombre(), entradaDatos.pedirDPI());
        clientes.add(cliente);
        cliente.addDispositivo(new Dispositivo(cliente, entradaDatos.pedirTipo(), entradaDatos.pedirFabricante()));
        cliente.getDispositivos().get(0).addServicios(new Servicio(entradaDatos.ingresarFecha()));
        cliente.getDispositivos().get(0).getServicios().get(0).elegirServicio(entradaDatos.elegirServicio());
        sc.close();
    }
    public void  opcion(){
        switch(entradaDatos.pedirOpcionMenu()){
            case 1:
                this.nuevaVenta();
            case 2:
                this.nuevoDispositivo();
            case 3:
                //tienda.nuevoServicio();
            case 4:
                //tienda.estadisticas();
            case 5:
                this.setSalirTienda(true); // setear la salida
        }
    }
    public void setSalirTienda(boolean salir){condicion =(boolean) salir;} // cambiar el valor de condicion
    public boolean salirTienda(){
        return condicion;
    }
    
    public void nuevoDispositivo(){
        // pasar el nombre de clientes para pedir cliente
        ArrayList<String> listaTemp = new ArrayList<>();
        for(Cliente i: clientes){listaTemp.add(i.getNombre());}
        // pedir el nombre del cliente
        String nombreCliente = entradaDatos.pedirCliente(listaTemp);
        // buscar el cliente por nombre
        Cliente cliente = null;
        for(Cliente j: clientes){
            if(j.getNombre().equals(nombreCliente)){
                cliente = j;
            }
        }
        // crear nuevo dispositivo
        Dispositivo dispo = new Dispositivo(cliente, entradaDatos.pedirTipo(), entradaDatos.pedirFabricante()); // crear dispositivo
        cliente.addDispositivo(dispo); // agregar dispositivo a la lista de dispositivos del cliente
        // buscar el index del dispositivo agregado y añadirle un nuevo servicio
        cliente.getDispositivos().get(cliente.getDispositivos().indexOf(dispo)).addServicios(new Servicio(entradaDatos.ingresarFecha())); 
        // buscar el index del dispositivo agregado y elegir el tipo de servicio del servicio agregado a la lista de servicios del dispositivo
        cliente.getDispositivos().get(cliente.getDispositivos().indexOf(dispo)).getServicios().get(0).elegirServicio(entradaDatos.elegirServicio());
    }

}
