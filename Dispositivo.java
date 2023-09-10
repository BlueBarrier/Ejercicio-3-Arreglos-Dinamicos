/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @description: Clase tipo dispositivo, almacena información del dispositivo del cliente
 * @version: 1.0
 * @fechaCreacion: 9/09/2023
 * @fechaMod: 09/09/2023
 */
import java.util.ArrayList;
public class Dispositivo {
    private Cliente cliente;
    private String tipo, fabricante;
    private int costo;
    private ArrayList<Servicio> servicios;

    public Dispositivo(Cliente cliente, String tipo, String fabricante){
        this.cliente = cliente;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.costo = 0;
        this.servicios= new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }
    public void addServicios(Servicio servicio){
        servicios.add(servicio);
    }

    public int getCosto() {
        return costo;
    }
    public void setCosto(){
        for(Servicio i : servicios){
            this.costo += i.getPrecio();
        }
    }

}
