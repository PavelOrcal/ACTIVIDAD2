import java.util.Arrays;
import java.util.Scanner;

public class SUMAELEMENTOS {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Escribe 5 números:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }

        System.out.println("Los números ingresados son: " + Arrays.toString(numeros));
        System.out.println("La suma de los 5 números es: " + suma);
    }
}
