import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = datos.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = datos.nextInt();
        System.out.println("ingrese el tercer numero");
        int num3 = datos.nextInt();
        int mayor;
        if ((num1>num2)&&(num1>num3)){
            mayor=num1;
        }else if ((num2>num1)&&(num2>num3)){
            mayor=num2;
        }else{
            mayor=num3;        }
        System.out.println("el mayor entre el primer, segundo y tercer numero es: " + mayor);

    }
}
