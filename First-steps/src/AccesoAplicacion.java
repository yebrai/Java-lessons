import javax.swing.JOptionPane;

public class AccesoAplicacion {
    public static void main(String[] args) {
        
        String clave = "Ivan";

        String pass = "";

        while(clave.equals(pass)==false){

            pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            if (clave.equals(pass)==false) {

                System.out.println("Contraseña incorrecta");
            }

        }

        System.out.println("Contraseña correcta. Acceso permitido");

    }
}
