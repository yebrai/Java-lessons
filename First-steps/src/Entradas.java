import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Introduce tu nombre, por favor");

        String nombreUsuario = entrada.nextLine();

        System.out.println("Introduce apellido, por favor");

        String apellidoUsuario = entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombreUsuario + " " + apellidoUsuario + ", el año que viene tendras " + (edad + 1) + " Años.");
    }
}
