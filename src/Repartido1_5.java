import java.util.Scanner;


// Conversor de temperatura
public class Repartido1_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese grados celsius: ");
        double celsius = leer.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " grados celsius a fahrenheit es: " + fahrenheit);
    }
}
