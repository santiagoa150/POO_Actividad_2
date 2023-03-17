import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Nombre del trabajador: ");
        String nombre = datos.nextLine();
        System.out.println("Numero de horas trabajadas: ");
        double horas_trabajadas = datos.nextDouble();
        System.out.println("Valor hora trabajadas: ");
        double valor_horas = datos.nextDouble();
        double salario = 0;

        if (horas_trabajadas>40) {
            double horas_extras = horas_trabajadas - 40;
            if (horas_extras > 8){
                double excedente = horas_extras - 8;
                salario = (40 * valor_horas) + (16 * valor_horas) + (excedente * 3 * valor_horas);
            }
            else {
                salario = 40 * valor_horas + horas_extras * 2 * valor_horas;
            }
        }
        else {
            salario = horas_trabajadas * valor_horas;
        }
        System.out.println( "El trabajador " + nombre + " gana: $" + salario );
    }
}


