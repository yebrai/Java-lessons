import javax.swing.*;

public class Entradas2 {

    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("introduce tu nombre, por favor");

        String edad = JOptionPane.showInputDialog("introduce tu edad, por favor");

        int edadUsuario = Integer.parseInt(edad);

        System.out.println("Hola " + nombreUsuario + ". el año que viene tendras " + (edadUsuario + 1) + " Años.");

        double decimal = 10000.0;

        System.out.println(decimal/3);

        // cortar decimales

        System.out.printf("%1.2f", decimal/3);

        System.out.printf("%1.4f", decimal/3);

        //

        String num1 = JOptionPane.showInputDialog("Introduce un numero, por favor");

        double num2 = Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");

        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
