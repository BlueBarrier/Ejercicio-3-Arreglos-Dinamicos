import java.util.ArrayList;
import java.util.Scanner;

class Servicio{
    int monto;
    String fecha;
    public Servicio(int monto, String fecha){
        this.monto=monto;
        this.fecha=fecha;
    }

    public int getMonto(){
        return monto;
    }
    public String getFecha(){
        return fecha;
    }
}

public class Statistics {
    public Statistics(){}
    public static void main(String[]args){
        Statistics programa= new Statistics();
        ArrayList<String> fabricantes = new ArrayList<>();
        fabricantes.add("apple");
        fabricantes.add("apple");
        fabricantes.add("apple");
        fabricantes.add("samsung");
        fabricantes.add("xiaomi");
        fabricantes.add("xiaomi");

        ArrayList<String> servicios = new ArrayList<>();
        servicios.add("pantalla");
        servicios.add("pantalla");
        servicios.add("pantalla");
        servicios.add("hardware");
        servicios.add("batería");
        servicios.add("batería");

        ArrayList<Servicio> ingresos = new ArrayList<>();
        ingresos.add(new Servicio(500,"19/07/23"));
        ingresos.add(new Servicio(500,"22/08/23"));
        ingresos.add(new Servicio(500,"14/09/23"));
        ingresos.add(new Servicio(1200,"19/06/23"));
        ingresos.add(new Servicio(1800,"12/11/23"));
        ingresos.add(new Servicio(1800,"12/1/0223"));
        programa.fabricantes_comunes(fabricantes);
        programa.ingresos_por_fecha(ingresos);

    }


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


        for(String j: fabricantes_unicos){
            System.out.println(j);
        } 
        for(int j: indices){
            System.out.println(j);
        }
    }

    //public void servicios_frecuentes(ArrayList<String> servicios){
        //lo mismo que fabricantes_comunes()
    //}

    public int ingresos_por_fecha(ArrayList<Servicio> ingresos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el mes inicial en dígitos de forma 00");
        int mes1 = scanner.nextInt();
        System.out.println("Ingrese el mes final en dígitos de forma 00");
        int mes2 = scanner.nextInt();

        int monto=0;
        for(Servicio h: ingresos){
            String[] fecha=h.getFecha().split("/");
            if(Integer.parseInt(fecha[1])>=mes1 && Integer.parseInt(fecha[1])<=mes2){
                monto+=h.getMonto();
            }
        }
        System.out.println(monto);
        scanner.close();
        return(monto);
    }
}
