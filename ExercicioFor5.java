import java.util.Scanner;

public class ExercicioFor5 {
    public static void main(String[] args) {
        /*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1. */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor de N: ");
        int n = scanner.nextInt();

        int fatorial = 1;

        for (int i=1; i<=n; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);

        scanner.close();
    }
}
