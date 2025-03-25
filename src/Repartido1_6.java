import java.util.Scanner;

// Simulador de compra
public class Repartido1_6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese precio del producto A: ");
        double productoA = leer.nextDouble();
        System.out.print("ingrese precio del producto B: ");
        double productoB = leer.nextDouble();
        System.out.print("ingrese precio del producto C: ");
        double productoC = leer.nextDouble();
        double total = productoA + productoB + productoC;
        double totalFinal = total+total*0.22;

        System.out.println("El total de la compra es: " + totalFinal);
    }
}
