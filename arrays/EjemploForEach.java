public class EjemploForEach {
    public static void main(String[] args) {
        /*
        calcular el número de letras ‘a’ en un
array de caracteres:

         */
        char[] caracteres = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        // Declaro una variable para contar las 'a' al recorrerlo
        int contadora = 0;
        /*for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a') contadora++;
        }*/

        // Cuando recorro to-do el array sin "parar" para hacer cosas concretas con algún elemento
        // puedo utilizar la estructura foreach
        // Se leería: para cada elemento de tipo char dentro del array caracteres
        for (char elemento: caracteres) {
            if (elemento == 'a') contadora++;
        }

        // Al salir del bucle imprimimos el contador
        System.out.println(contadora);
    }
}
