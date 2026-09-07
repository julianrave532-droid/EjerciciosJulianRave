public class Main {

    public int[] numbers;
    public String frase;

    // EJERCICIO 1: Contar palabras
    public static int contarPalabras(String frase) {
        String[] palabras = frase.split(" ");
        return palabras.length;
    }

    // EJERCICIO 2: Contar letras
    public static int contarLetras(String frase) {
        int letras = frase.replace(" ", "").length();
        return letras;
    }

    // EJERCICIO 3: Encontrar el número menor
    public static int numeroMenor(int[] numbers) {
        int menor = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (menor > numbers[i]) {
                menor = numbers[i];
            }
        }

        return menor;
    }

    // EJERCICIO 4: Encontrar el número mayor y menor
    public static int[] numeroMayorConMenor(int[] numbers) {
        int mayor = numbers[0];
        int menor = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > mayor) {
                mayor = numbers[i];
            }

            if (menor > numbers[i]) {
                menor = numbers[i];
            }
        }

        int[] resultado = {mayor, menor};
        return resultado;
    }

    // EJERCICIO 5: Encontrar el segundo número mayor
    public static int SegundoNumeroMayor(int[] numbers) {
        int mayor = numbers[0];
        int segundo = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > mayor) {
                segundo = mayor;
                mayor = numbers[i];
            } else if (numbers[i] > segundo && numbers[i] < mayor) {
                segundo = numbers[i];
            }
        }

        return segundo;
    }


    public static void main(String[] args) {

        // Ejercicio 1
        System.out.println(contarPalabras("Pepito juega futbol"));

        // Ejercicio 2
        System.out.println(contarLetras("Pepito juega futbol"));

        // Ejercicio 3
        System.out.println(numeroMenor(
                new int[]{1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5}
        ));

        // Ejercicio 4
        System.out.println(java.util.Arrays.toString(
                numeroMayorConMenor(
                        new int[]{1, 89, 25, 12, 4, 8, 45, 9, 1, 2, 3, 5}
                )
        ));

        // Ejercicio 5
        System.out.println(SegundoNumeroMayor(
                new int[]{1, 89, 25, 12, 45, 8, 9, 1, 2, 3, 5}
        ));
    }
}