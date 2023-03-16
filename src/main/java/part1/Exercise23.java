package part1;

import java.util.Scanner;

public class Exercise23 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema para allar soluciones de una ecuación de segundo grado.");
        System.out.println("");

        System.out.println("Ingrese a: ");
        Exercise23.validateDouble(sc);
        double a = sc.nextDouble();
        System.out.println("");

        System.out.println("Ingrese b: ");
        Exercise23.validateDouble(sc);
        double b = sc.nextDouble();
        System.out.println("");

        System.out.println("Ingrese c: ");
        Exercise23.validateDouble(sc);
        double c = sc.nextDouble();

        double determinante = Math.pow(b, 2) - 4 * a * c;
        if (determinante >= 0) {
            double raiz = Math.sqrt(determinante);
            double solucion1 = -b + raiz / 2 * a;
            double solucion2 = -b - raiz / 2 * a;
            System.out.println("Solución número 1: " + solucion1);
            System.out.println("Solución número 2: " + solucion2);
        }else {
            System.out.println("La ecuación no tiene solución.");
        }
    }

    private static void validateDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
