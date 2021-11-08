package estructurasDeControl;

public class EjemplosMathRandom {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.printf("%.2f ", Math.random()); // da un número double entre 0 y 0.999999
        }
        System.out.println("Math.random con casting a int");
        int num;
        for (int i = 0; i < 100; i++) {
            num = (int) Math.random(); // esto no sirve para nada porque siempre da 0
            System.out.print(num + " ");
        }
        System.out.println("\n\nNúmeros de 0 a 9");
        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * 10);
            System.out.print(num + " ");
        }

        System.out.println("\n\nNúmeros de 1 a 10");
        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * 10 + 1); // La fórmula podría ser: (int) (Math.random() * máximo + mínimo)
            System.out.print(num + " ");
        }

        System.out.println("\n\n100 números entre 1 y 49");
        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * 49 + 1);
            System.out.print(num + " ");
        }

        // La fórmula podría ser: (int) (Math.random() * máximo + mínimo)
        System.out.println("\n\n200 números entre 1 y 75");
        for (int i = 0; i < 200; i++) {
            num = (int) (Math.random() * 75 + 1);
            System.out.print(num + " ");
        }

    }
}
