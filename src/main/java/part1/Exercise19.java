package part1;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistem de triángulos equiláteros.");
        System.out.println("Ingrese uno de los lados: ");
        Exercise19.validateDouble(sc);
        double lado = sc.nextDouble();
        double perimetro = lado * 3;
        double altura = (Math.sqrt(3) * lado) / 2;
        double area = (lado * altura) / 2;
        
        System.out.println("Se ingresó el valor de una lado: " + lado);
        System.out.println("Se calculó el valor del perímetro: " + perimetro);
        System.out.println("Se calculó el valor de la altura: " + altura);
        System.out.println("Se calculó el valor del area: " + area);
        
    }
    
    private static void validateDouble(Scanner sc){
        while(!sc.hasNextDouble()){
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
