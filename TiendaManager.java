/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @description: driverprogram
 * @version: 2.0
 * @fechaCreacion: 9/09/2023
 * @fechaMod: 11/09/2023
 */
import java.util.ArrayList;
public class TiendaManager {
    private EntradaDatos entradaDatos = new EntradaDatos();
    boolean condicion = false;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    

    public void nuevaVenta(){
        Cliente cliente = new Cliente(entradaDatos.pedirNombre(), entradaDatos.pedirDPI());
        clientes.add(cliente);
        cliente.addDispositivo(new Dispositivo(cliente, entradaDatos.pedirTipo(), entradaDatos.pedirFabricante()));
        cliente.getDispositivos().get(0).addServicios(new Servicio(entradaDatos.ingresarFecha()));
        cliente.getDispositivos().get(0).getServicios().get(0).elegirServicio(entradaDatos.elegirServicio());
    }
    public void  opcion(){
        int opcion = entradaDatos.pedirOpcionMenu();
        switch(opcion){
            case 1:
                this.nuevaVenta();
                break;
            case 2:
                this.nuevoDispositivo();
                break;
            case 3:
                this.nuevoServicio();
                break;
            case 4:
                //tienda.estadisticas();
            case 5:
                this.terminarReparacion();
                break;
            case 6:
                System.out.println("Gracias por usar TECHGT");
                this.setSalirTienda(true); // setear la salida
                break;
            default:
                System.out.println("VOS! Que hiciste VOS!");
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

    public void nuevoServicio(){
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
        // pasar el nombre de dispositivo para pedir dispositivo
        ArrayList<String> listaTemp2 = new ArrayList<>();
        for(Dispositivo k: cliente.getDispositivos()){
            listaTemp2.add(k.getTipo());
        }
        // pedir el nombre del dispositivo
        String tipoDispositivo = entradaDatos.pedirDispositivo(listaTemp2);
        // buscar el dispositivo por tipo
        Dispositivo dispositivo = null;
        for(Dispositivo l: cliente.getDispositivos()){
            if(l.getTipo().equals(tipoDispositivo)){
                dispositivo = l;
            }
        }
        Servicio servicio = new Servicio(entradaDatos.ingresarFecha());
        dispositivo.addServicios(servicio);
        dispositivo.getServicios().get(dispositivo.getServicios().indexOf(servicio)).elegirServicio(entradaDatos.elegirServicio());

    }

    public void terminarReparacion(){
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

        // sumar todos los servicios
        System.out.println(cliente+"\n");
        cliente.generarFactura();
    }
}
