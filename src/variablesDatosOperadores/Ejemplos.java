package variablesDatosOperadores;

import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {

  // OPERADORES RELACIONALES
        /*int a = 5;
        int b = 6;
        int c = 7;
        boolean igual = a == b;
        boolean distintos = a !=b;
        boolean mayorQue = a > b;
        boolean mayorIgualQue = a >= b;

        // Con los operadores relacionales comparamos
        // Y el resultado es un valor boolean
        System.out.println(igual); // a es igual a b
        System.out.println(distintos);
        System.out.println(mayorQue);
        System.out.println(mayorIgualQue);

        boolean resultado = a + 5 == c + 4;
        System.out.println(resultado);

        boolean orden = (a < b) && (b < c); */


        // Ejercicio
        int i = 8, j = 5;
        // a)
        //boolean res = i <= j;
        //System.out.println(i <= j);
        // con char comparo los valores de la tabla ascii
        char c = 'c', d = 'd';
        System.out.println(c > d); // 99 > 100

        char D = 'D';
        System.out.println(c < D); // 99 < 68

        int ce = 'c';
        System.out.println(ce);

        // c)
        float x = 0.005f, y = -0.01f;
        System.out.println("c) " + (x >=0));

        // d)
        System.out.println("d) " + (x < y--));

        // e)
        System.out.println("j) " + (j !=6));

        //   f) c == 99
        System.out.println("f) " + (c == 99));

        // g) !(i <= j)
        System.out.println("g) " + !(i <= j));

        // h) !(c == 99)
        System.out.println("h) " + !(c == 99));

        // i) !(x > 0)
        System.out.println("i) " + (!(x > 0)));

        // j) –j == i - 13
        boolean r = -j == i - 13;



        // k)
        System.out.println("k) " + (++x > 0));



    }
}
