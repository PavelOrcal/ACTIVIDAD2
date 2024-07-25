import java.util.Scanner;

public class SUMAELEMENTOS {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingresa 5 numeros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextInt();
        }
    
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma de los 5 numeros es: " + suma);
    }
}
