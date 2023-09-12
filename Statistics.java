/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC 2008 - 50
 * 
 * @author: Erick Barrera - 231238 
 * @author: Juan Figueroa - 23092
 * @description: programa para estadísticas de la tienda
 * @version: 2.0
 * @fechaCreacion: 10/09/2023
 * @fechaMod: 11/09/2023
 */
import java.util.ArrayList;
public class Statistics {
    EntradaDatos entradaDatos = new EntradaDatos();
    public void fabricantes_comunes(ArrayList<String> fabricantes){
        //se obtiene una lista de todos los fabricantes sin repetir
        ArrayList<String> fabricantes_unicos = new ArrayList<>();
        for(String fabricante: fabricantes){
            if(fabricantes_unicos.contains(fabricante)==false){
                fabricantes_unicos.add(fabricante);
            }
        }

        //Se obtiene el número de veces que se repiten
        ArrayList<Integer> indices = new ArrayList<>();
        for(String j: fabricantes_unicos){
            int count=0;
            for(String k: fabricantes){
                if(k==j){count++;}
            }
            indices.add(count);
        } 
        int n=indices.size();
        boolean cambio;

        do{
            cambio=false;
            for(int i=1;i<n; i++){
                if(indices.get(i-1)<indices.get(i)){
                    int temp1 = indices.get(i-1);
                    String temp2 = fabricantes_unicos.get(i-1);
                    indices.set(i-1,indices.get(i));
                    fabricantes_unicos.set(i-1,fabricantes_unicos.get(i));
                    indices.set(i,temp1);
                    fabricantes_unicos.set(i,temp2);
                    cambio=true;
                }
            }
            n--;
        } while(cambio);

        System.out.println("Fabricantes más comunes: Número de dispositivos del fabricante + fabricante");
        for(int i=0;i<indices.size();i++){
            System.out.println(indices.get(i)+" "+fabricantes_unicos.get(i));
        } 
    }
    
    public void servicios_frecuentes(ArrayList<String> servicios){
        //se obtiene una lista de todos los servicios sin repetir
        ArrayList<String> servicios_unicos = new ArrayList<>();
        for(String servicio: servicios){
            if(servicios_unicos.contains(servicio)==false){
                servicios_unicos.add(servicio);
            }
        }
    
        //Se obtiene el número de veces que se repiten
        ArrayList<Integer> indices = new ArrayList<>();
        for(String j: servicios_unicos){
            int count=0;
            for(String k: servicios){
                if(k==j){count++;}
            }
            indices.add(count);
        } 
        int n=indices.size();
        boolean cambio;
    
        do{
            cambio=false;
            for(int i=1;i<n; i++){
                if(indices.get(i-1)<indices.get(i)){
                    int temp1 = indices.get(i-1);
                    String temp2 = servicios_unicos.get(i-1);
                    indices.set(i-1,indices.get(i));
                    servicios_unicos.set(i-1,servicios_unicos.get(i));
                    indices.set(i,temp1);
                    servicios_unicos.set(i,temp2);
                    cambio=true;
                }
            }
            n--;
        } while(cambio);
    
        System.out.println("Servicios más frecuentes: Veces solicitadas + servicio");
        for(int i=0;i<indices.size();i++){
            System.out.println(indices.get(i)+" "+servicios_unicos.get(i));
        } 
        
    }

    public int ingresos_por_fecha(ArrayList<Servicio> ingresos){
        int mes1 = entradaDatos.pedirInicioMes();
        int mes2 = entradaDatos.pedirFinMes();
        int monto=0;
        for(Servicio h: ingresos){
            String[] fecha=h.getFecha().split("/");
            if(Integer.parseInt(fecha[1])>=mes1 && Integer.parseInt(fecha[1])<=mes2){
                monto+=h.getPrecio();
            }
        }
        return(monto);
    }
}
