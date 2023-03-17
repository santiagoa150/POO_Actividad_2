
import java.util.Scanner;
public class EJERCICIO14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double VD1, VD2, VD3, SALAR;
        double TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;
        
        System.out.print("Ingrese ventas del departamento 1: ");
        VD1 = sc.nextDouble();
        System.out.print("Ingrese ventas del departamento 2: ");
        VD2 = sc.nextDouble();
        System.out.print("Ingrese ventas del departamento 3: ");
        VD3 = sc.nextDouble();
        System.out.print("Ingrese salario de los vendedores: ");
        SALAR = sc.nextDouble();
        
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;
        
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }
        
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }
        
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }
        
        System.out.println("Salario vendedores departamento 1: " + SALAR1);
        System.out.println("Salario vendedores departamento 2: " + SALAR2);
        System.out.println("Salario vendedores departamento 3: " + SALAR3);
    }}