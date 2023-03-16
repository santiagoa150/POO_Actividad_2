package part2.figuras;

public class TrianguloRectangulo {
    
    private double base;
    private double altura;
    
    public TrianguloRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return (this.base * this.altura) / 2;
    }
    
    public double calcularPerimetro(){
        double hipotenusa = this.calcularHipotenusa();
        return this.base + this.altura + hipotenusa;
    }
    
    public double calcularHipotenusa(){
        return Math.pow(this.base * this.base + this.altura * this.altura, 0.5);
    }
    
    public void getType(){
        double hipotenusa = this.calcularHipotenusa();
        if(this.base == this.altura && this.altura == hipotenusa){
            System.out.println("Es un triángulo equilátero.");
        } else if (this.base != this.altura && this.altura != hipotenusa && hipotenusa != this.base){
            System.out.println("Es un triángulo escaleno.");
        } else{
            System.out.println("Es un triángulo isóceles.");
        }
    }
}
