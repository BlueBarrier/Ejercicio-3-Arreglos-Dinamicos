public class Servicio {
    private String fecha;
    private int[] precios;
    private int precio;
    private String[] tipos;
    private String tipo;

    public Servicio(String tipo, int precio){
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
}
