import java.util.Scanner;


// Area de rectangulo
public class Repartido1_4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese la base: ");
        double base = leer.nextDouble();
        System.out.print("ingrese la altura: ");
        double altura = leer.nextDouble();
        double area = base*altura;
        System.out.println("El area es: "+ area);
    }
}
