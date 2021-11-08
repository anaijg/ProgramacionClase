package variablesDatosOperadores;

public class Ejercicio36 {
    public static void main(String[] args) {
       /*
       36. Escribe un programa que declare e inicialice una variable para cada uno de los tipos
primitivos. A continuación, asigna sucesivamente una variable a todas las demás.
Completa la siguiente tabla con las asignaciones válidas (escribe “=” si una variable
de la fila se puede asignar a una de la columna, y “NO” en caso contrario).
        */

        // Escribe un programa que declare e inicialice una variable para cada uno de los tipos
        //primitivos.
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5f;
        double d = 6;
        char c = 7; // ojo; no pongo 7; 7 es un nº en la tabla ASCII que corresponde a un carácter determinado
        boolean bool = true;

        // A continuación, asigna sucesivamente una variable a todas las demás.
        // Empezamos con byte
        s = b; // SÍ todos estos son casting implícito (basta el =)
        i = b;
        l = b;
        f = b;
        d = b;
        c = (char) b; // NO implícito, pero puedo hacer casting explícito
        //bool = b; // NO

        // Seguimos con short
        b = (byte) s;  // esto es casting explícito, puedes hacer la conversión pero "forzando"
        i = s;
        l = b;
        f = b;
        d = b;
        c = (char) b; // NO; si no funciona el casting implícito probamos el explícito
        //bool = (boolean) b; // NO, ni siquiera admite casting explícito

      // posible problema
        long numeroGrande = 100_000_000_000_000L;
        // casting a int
        int número = (int) numeroGrande;
        //System.out.println(número);

        // ¿Cómo se el número máximo que puedo poner en un int?
        System.out.println(Integer.MAX_VALUE); // nº máximo de int
        System.out.println(Integer.MIN_VALUE); // número mínimo de int

        // también podemos verlo con
        long varL = Long.MAX_VALUE;
        float varF = Float.MAX_VALUE; // etc.

    }
}
