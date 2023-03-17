
import java.util.Scanner;
public class EJERCICIO15 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoa, pesob, pesoc, pesod;
        System.out.println("Peso de la esfera A: " );
        pesoa = entrada.nextDouble();
        System.out.println("Peso de la esfera B: " );
        pesob = entrada.nextDouble();
        System.out.println("Peso de la esfera C: " );
        pesoc = entrada.nextDouble();
        System.out.println("Peso de la esfera D: " );
        pesod = entrada.nextDouble();
        System.out.println(" ");
        
        if (pesoa==pesob && pesoa==pesoc){
            if (pesoa > pesod){
                System.out.println("LA ESFERA D ES LA DIFERENTE Y");  
                }else{
                     System.out.println("LA ESFERA D ES LA DIFERENTE Y");                
                } }  
        if (pesoa==pesob && pesoa==pesod){
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (pesoc > pesoa){
                System.out.println("Y ES DE MAYOR PESO");
                }else{
                     System.out.println("Y ES DE MENOR PESO");                
                } }  
        if (pesoa==pesoc && pesoa==pesod){
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (pesob > pesod){
                System.out.println("Y ES DE MAYOR PESO");
                 }else
                    System.out.println("Y ES DE MENOR PESO");
                    }else{
                       System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (pesoa > pesob){
                System.out.println("Y ES DE MAYOR PESO");
               }else{
                     System.out.println("Y ES DE MENOR PESO");                
                }
          }
     } }