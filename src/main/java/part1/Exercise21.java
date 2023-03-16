package part1;

import java.util.Scanner;

public class Exercise21 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema de cálculo de triángulos.");
        System.out.println("Ingrese la base: ");
        Exercise21.validateDouble(sc);
        double base = sc.nextDouble();
        
        System.out.println("Ingrese el lado 1: ");
        Exercise21.validateDouble(sc);
        double lado1 = sc.nextDouble();
        
        System.out.println("Ingrese el lado 2: ");
        Exercise21.validateDouble(sc);
        double lado2 = sc.nextDouble();
        
        double perimetro = lado1 + lado2 + base;
        double s = perimetro / 2;
                
        double altura = (2 / base) * Math.sqrt(s * (s - base)*(s - lado1)*(s - lado2));
        double area = (base * altura) / 2;
        
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El semiperimetro es: " + s);
        System.out.println("El area es: " + area);
    }
    
    private static void validateDouble(Scanner sc){
        while(!sc.hasNextDouble()){
            System.out.println("Porfavor ingresa un número valido.");
            sc.next();
        }
    }
}
