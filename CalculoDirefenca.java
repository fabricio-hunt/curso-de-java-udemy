import java.util.Random;
import java.util.Scanner;

public class CalculoDirefenca {
    public static void main(String[] args) {
        /* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = scanner.nextInt();

        System.out.println("Digite o valor de D: ");
        int d = scanner.nextInt();

        int direnca = (a * b -c *d);

        System.out.println("A diferença entre os valores digitados é: " + direnca);

    }
}
