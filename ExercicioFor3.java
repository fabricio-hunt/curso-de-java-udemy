import java.util.Scanner;

            /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
            de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
            conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
            peso 5.*/

public class ExercicioFor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de casos de teste: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++ ){
            System.out.println("Digite o numero de testes: ");
            double a = scanner.nextDouble();

            System.out.println("Digite o numero de testes: ");
            double b = scanner.nextDouble();

            System.out.println("Digite o numero de testes: ");
            double c = scanner.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.println("A sua média é: " + media);

        }




        scanner.close();
    }
}
