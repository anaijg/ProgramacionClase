package ejemplosChar;

public class Ejemplo {
    public static void main(String[] args) {
        /*
        (Para entender cómo es que se puede recorrer el alfabeto secuencialmente, recuerda
que Java usa el juego de caracteres Unicode, concretamente el esquema de codificación
UTF-16, que es un superconjunto del código de caracteres ASCII; en el caso de los
caracteres del 0 al 126, son los mismos en ambos conjuntos; concretamente, las letras de
la A a la Z mayúsculas se corresponden con los números -en decimal- 65 a 90, y así es
como los recorre Java en este bucle).*/

        // ASCII letras minúsculas van del 97 - 122
        // ASCII letras mayúsculas van del 65 - 90

        char letra = 'A'; // 65 en la tabla
        while (letra <= 'z') { // funciona no porque Java sepa el alfabeto, sino porque va siguiendo el orden de los números correspondientes en la tabla ascii
            System.out.print(letra);
            letra++;
        }
    }
}
