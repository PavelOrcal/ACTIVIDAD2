import java.util.Scanner;

public class NumParImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingresa 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = teclado.nextInt();
        }

        int pares = 0;
        int impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }
}

