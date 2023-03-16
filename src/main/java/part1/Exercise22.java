package part1;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de cálculo de salarios.");
        System.out.println("");
        System.out.println("Ingrese el nombre del usuario: ");
        String name = sc.next() + sc.nextLine();

        System.out.println("");
        System.out.println(name + " ingrese su salario por hora: ");
        Exercise22.validateDouble(sc);
        double salarioHora = sc.nextInt();

        System.out.println("");
        System.out.println(name + " ingrese las horas totales trabajadas este mes: ");
        Exercise22.validateDouble(sc);
        double horas = sc.nextDouble();

        System.out.println("S");
        double salario = salarioHora * horas;
        if (salario > 450000) {
            System.out.println("Muchas gracias " + name + " su salario es: $" + salario + ".");
        } else {
            System.out.println("Muchas gracias " + name + ".");

        }
    }

    private static void validateDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
