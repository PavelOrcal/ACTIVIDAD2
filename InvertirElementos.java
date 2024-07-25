import java.util.Scanner;

public class InvertirElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];

        System.out.println("Ingresa 6 numeros:");

        for (int i = 0; i < 6; i++) {
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length / 2; i++) {
            int resultado = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = resultado;
        }

        System.out.println("El acomodo de los numeros invertidos seria: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
