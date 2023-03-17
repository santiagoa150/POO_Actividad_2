import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String[] arg) {
        Scanner datos = new Scanner(System.in);
        System.out.println("señor usuario digite su numero de inscripcion");
        int inscripcion = datos.nextInt();
        System.out.println("señor usuario digite su nombre");
        String nombre = datos.next();
        System.out.println("señor usuario digite su patrimonio");
        int patrimonio = datos.nextInt();
        System.out.println("señor usuario digite su estrato social");
        int estrato = datos.nextInt();
        int matricula = 50000;

        if((patrimonio>2000000)&&(estrato>3)){
            matricula += patrimonio*(0.03);
        }
        System.out.printf("El estudiante con número de inscripción %d, y nombre %s debe pagar %d", inscripcion, nombre, matricula);    }
}

