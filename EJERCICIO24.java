
import java.util.Scanner;
public class EJERCICIO24 {
        public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        int A = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        int B = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        int C = entrada.nextInt();
        
        if (A>B && A>C){
            System.out.println("La esfera A es la de mayor peso ");
        }
        else if (B>A && B>C){
            System.out.println("La esfera B es la de mayor peso ");
        }
        else if (C>A && C>B){
            System.out.println("La esfera C es la de mayor peso ");
        }}}