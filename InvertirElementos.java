import java.util.Arrays;
import java.util.Scanner;

public class InvertirElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] numeros = new String[6];

        System.out.println("Escribe 6 números:");

        for (int i = 0; i < 6; i++) {
            numeros[i] = teclado.nextLine();
        }

        for (int i = 0; i < numeros.length / 2; i++) {
            String resultado = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = resultado;
        }

        System.out.println("El acomodo de los números invertidos sería: ");
        System.out.println(Arrays.toString(numeros));
    }
}
