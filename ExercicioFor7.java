import java.util.Scanner;
    //Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
    //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
    //exemplo.

public class ExercicioFor7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Leia o valor de N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++){
            int iterador = i;
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d%n", iterador, quadrado, cubo);
        }
        System.out.println("F.I.M");
        scanner.close();
    }
}
