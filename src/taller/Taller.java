package taller;
import java.util.Scanner;
import java.util.*;

public class Taller {

   
    public static void main(String[] args) { //[] {} \
        Scanner leer = new Scanner (System.in);
    ArrayList<String> nombre = new ArrayList();
    ArrayList<Double> velocidad = new ArrayList();
    ArrayList<Double> tiempo = new ArrayList();
    int y=100;
    boolean continuar =true;
    int control;
    double total,suma=0,contr=0;
    double tot=0;
    String dat="";
    while(continuar){
        System.out.println("Ingrese el nombre del estudiante");
        nombre.add(leer.next());
        System.out.println("Ingrese la velocidad del estudiante");
        velocidad.add(leer.nextDouble());
        System.out.println("¿Desea ingresar otro estudiante? (1 si) (0 no)");
        control=leer.nextInt();
        if(control==0){
        continuar=false;
        }
        }
        for(int x=0;x<nombre.size();x++){
            total=(y/velocidad.get(x));
            tiempo.add(total);
            System.out.println(nombre.get(x) +"\t"+ velocidad.get(x) +"\t"+ tiempo.get(x));
            suma=suma+tiempo.get(x);
            if(tiempo.get(x)>contr){
                contr=tiempo.get(x);
                dat=nombre.get(x);
            }
            tot=(suma/velocidad.size());
            
        }
        
        System.out.println("El promedio del salon es de "+tot);
        System.out.println("El tiempo mas rapido fue de "+contr+" que corresponde al estudiante: "+dat);
        
        
    }
 }   

