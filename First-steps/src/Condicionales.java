import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor");
        
        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }
}
