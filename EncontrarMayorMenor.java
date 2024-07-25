import java.util.Arrays;
import java.util.Scanner;

public class EncontrarMayorMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Ingresa 8 numeros:");

        for (int i = 0; i < 8; i++) {
            numeros[i] = teclado.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Numeros ordenados: " + Arrays.toString(numeros));
        System.out.println("El número menor es: " + numeros[0]);
        System.out.println("El número mayor es: " + numeros[7]);
    }
}
