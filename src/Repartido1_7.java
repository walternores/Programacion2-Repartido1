import java.util.Scanner;


// Informacion de usuario
public class Repartido1_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.print("ingrese la edad: ");
        int edad = leer.nextInt();
        leer.nextLine();  // limpia el buffer de entrada
        System.out.print("Ingrese la ciudad: ");
        String ciudad = leer.nextLine();

        String mensaje = "Hola ".concat(nombre)+", tenés "+edad+" años y vivís en ".concat(ciudad);
        System.out.println(mensaje);

    }
}
