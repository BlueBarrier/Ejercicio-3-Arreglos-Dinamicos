/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @description: Clase tipo servicio, almacena información del servicio a brindar asi como los servicios disponibles y su precio
 * @version: 1.0
 * @fechaCreacion: 9/09/2023
 * @fechaMod: 09/09/2023
 */
public class Servicio {
    private String fecha;
    private int precio;
    private int[] precios;
    private String tipo;
    private String[] tipos;

    public Servicio(String tipo, int precio, String fecha){
        this.fecha = fecha;
        this.tipo = null;
        this.precio = 0;
    }

    public int getPrecio() {
        return precio;
    }
    public String getTipo() {
        return tipo;
    }
    public String getFecha() {
        return fecha;
    }
    public void elegirServicio(int opcion){
        switch(opcion){
            case 1:
                this.tipo = tipos[0];
                this.precio = precios[0];
                break;
            case 2:
                this.tipo = tipos[1];
                this.precio = precios[1];
                break;
            case 3:
                this.tipo = tipos[2];
                this.precio = precios[2];
                break;
            case 4:
                this.tipo = tipos[3];
                this.precio = precios[3];
                break;
            case 5:
                this.tipo = tipos[4];
                this.precio = precios[4];
                break;
            default:
                this.tipo = "Consulta";
                this.precio = 150;
                break;
        }
    }
}
