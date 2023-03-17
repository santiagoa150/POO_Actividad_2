import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner Datos = new Scanner(System.in);
        System.out.println("Señor usuario por favor digite el primer numero");
        double a = Datos.nextDouble();
        System.out.println("Señor usuario por favor digite el segundo numero");
        double b = Datos.nextDouble();
        if (a>b){
            System.out.println("A ES MAYOR QUE B");
        }else{
            if (a==b){
                System.out.println("A ES IGUAL A B");
            }else{
                System.out.println("A ES MENOR QUE B");
            }
        }

    }
}
