
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas filas quieres?");
        int filas = scanner.nextInt();

        System.out.println("Cuantas columnas quieres?");
        int columnas = scanner.nextInt();

        int[][] numeros = new int[filas][columnas];
        int[][] resultado = new int[3][columnas];

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

            resultado[1][j] = numeros[0][j];
            resultado[2][j] = numeros[0][j];

            for (int i = 0; i < filas; i++) {

                resultado[0][j] += numeros[i][j];

                if (numeros[i][j] > resultado[1][j]) {
                    resultado[1][j] = numeros[i][j];
                }

                if (numeros[i][j] < resultado[2][j]) {
                    resultado[2][j] = numeros[i][j];
                }
            }
        }

        System.out.println("Suma:");
        for (int j = 0; j < columnas; j++) {
            System.out.print(resultado[0][j] + " ");
        }

        System.out.println("\nMaximo:");
        for (int j = 0; j < columnas; j++) {
            System.out.print(resultado[1][j] + " ");
        }

        System.out.println("\nMinimo:");
        for (int j = 0; j < columnas; j++) {
            System.out.print(resultado[2][j] + " ");
        }
    }
}
