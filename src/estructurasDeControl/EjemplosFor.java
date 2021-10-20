package estructurasDeControl;

public class EjemplosFor {
    public static void main(String[] args) {
        // int i = 0 <-> desde
        // condición: mientras se cumpla que i < 10 (true / false)
        // modificación: cambio la i al finalizar una iteración antes de entrar en la siguiente
        System.out.println("incrementando de 1 en 1");
        for(int i = 1; i < 10; i++) { // si sólo hay una instrucción puede no haber llaves
            // código que queremos que se repita n veces
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i = 1; i <= 10; i++) { // si sólo hay una instrucción puede no haber llaves
            // código que queremos que se repita n veces
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("decrementando de 1 en 1");
        for(int i = 10; i >= 0; i--) { // si sólo hay una instrucción puede no haber llaves
            // código que queremos que se repita n veces
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 5; i >= -10; i--) { // si sólo hay una instrucción puede no haber llaves
            // código que queremos que se repita n veces
            System.out.print(i + " ");
        }

        System.out.println("\n\nsaltando de n en n");
        for(int i = 0; i <= 10; i+=2) { // si sólo hay una instrucción puede no haber llaves
            // código que queremos que se repita n veces
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 100; i > 50; i-=5) { // si sólo hay una instrucción puede no haber llaves
            // código que queremos que se repita n veces
            System.out.print(i + " ");
        }
    }
}
