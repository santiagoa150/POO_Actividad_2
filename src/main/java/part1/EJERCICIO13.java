
import java.util.Scanner;
public class EJERCICIO13 {public static void main(String[] args) {
		double pdes, valpag;
		String color, a = "BLANCO", b = "VERDE" , c = "AMARILLO", d = "AZUL";
		Scanner entrada = new Scanner(System.in);
		System.out.println("INGRESE COLOR DE LA BOLA:");
		color = entrada.nextLine();
		System.out.println("INGRESE EL VALOR DE LA COMPRA:");
		int valcomp = entrada.nextInt();
		
		if (color.equalsIgnoreCase(a)){
			pdes = 0;
		}
		else if (color.equalsIgnoreCase(b)) {
			pdes = 10;
		}
		else if (color.equalsIgnoreCase(c)) {
			pdes = 25;
		}
		else if (color.equalsIgnoreCase(d)) {
			pdes = 50;
		}
		else {
			pdes = 100;
		}
		
		valpag = valcomp-((pdes*valcomp)/100);
		System.out.println("EL CLIENTE DEBE PAGAR: $"+ valpag);
	}}