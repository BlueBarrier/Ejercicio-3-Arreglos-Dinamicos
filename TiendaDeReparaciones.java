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
public class TiendaDeReparaciones {
    public static void main(String[] args) {
        TiendaManager tienda = new TiendaManager();
        boolean salir = false;
        System.out.println("BIENVENIDO A TECHGT");
        do{
            tienda.nuevaVenta();
            switch(tienda.opcion()){
                case 1:
                    tienda.nuevaVenta();
                case 2:
                    //tienda.nuevoDispositivo();
                case 3:
                    //tienda.nuevoServicio();
                case 4:
                    //tienda.estadisticas();
            }
        }while(!salir);
    }
}
