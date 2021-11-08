package estructurasDeControl;

import java.util.Scanner;

public class Ejercicio09b {
    public static void main(String[] args) {
      /*
      9. Escribe un programa que pida un nombre de usuario y una contraseña.
      Esos datos se comparan con dos valores guardados previamente.
      Si coinciden, se indica “Has entrado al sistema”,
      en caso contrario se da un error.
       */

        // Ponemos un usuario y un password para comparar
        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario:"); // pido el usuario
        String usuario = sc.next();
        if (usuario.equals(usuarioCorrecto)) { // veo si es correcto
            // si está bien el usuario, pregunto la contraseña
            System.out.println("Contraseña:");
            String pass = sc.next();
            if (pass.equals(contraseñaCorrecta)) { // compruebo contraseña
                System.out.println("Has entrado al sistema.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        } else {
            System.out.println("Usuario incorrecto.");
        }




    }
}
