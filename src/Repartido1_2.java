import java.util.Scanner;

// Suma dos numeros
public class Repartido1_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        int numero1= leer.nextInt();
        System.out.print("ingrese el segundo numero: ");
        int numero2= leer.nextInt();
        int suma=numero1+numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);


    }
}
