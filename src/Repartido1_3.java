
import java.util.Scanner;


// Calcular edad
public class Repartido1_3 {
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese el año actual: ");
        int anioActual = leer.nextInt();
        System.out.print("ingrese el año de nacimiento: ");
        int anioNacimiento = leer.nextInt();

        System.out.println("La edad es: "+ (anioActual-anioNacimiento));

    }
}
