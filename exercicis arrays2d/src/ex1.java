
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas filas quieres?");
        int filas = scanner.nextInt();

        System.out.println("Cuantas columnas quieres?");
        int columnas = scanner.nextInt();

        int[][] numeros = new int[filas][columnas];
        int[] suma = new int[columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduce un numero:");
                numeros[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                suma[j] = suma[j] + numeros[i][j];
            }
        }

        System.out.println("Suma de columnas:");

        for (int j = 0; j < columnas; j++) {
            System.out.print(suma[j] + " ");
        }
    }
}
