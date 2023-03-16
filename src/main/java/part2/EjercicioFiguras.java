package part2;

import part2.figuras.Circulo;
import part2.figuras.Cuadrado;
import part2.figuras.Rectangulo;
import part2.figuras.TrianguloRectangulo;

public class EjercicioFiguras {

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("¡ Bienvenido a el ejercicio de las figuras !");
        System.out.println("============================================");
        System.out.println("");
        
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(1,2);
        Cuadrado cuadrado = new Cuadrado(3);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3,5);
    
        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
        
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
        
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perímetro del cuadra es: " + cuadrado.calcularPerimetro());
        
        System.out.println("El área del triángula es: " + triangulo.calcularArea());
        System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
        
        triangulo.getType();
    }
}
