import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago   */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da peça 1 : ");
        int codPeca1 = scanner.nextInt();

        System.out.println("Digite a quantidade de peças 1: ");
        int quantPecas1 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peças 1: ");
        double valorUndPecas1 = scanner.nextDouble();

        System.out.println("Digite o código da peça 2 : ");
        int codPeca2 = scanner.nextInt();

        System.out.println("Digite a quantidade de peças 2: ");
        int quantPecas2 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peças 2: ");
        double valorUndPecas2 = scanner.nextDouble();

        double soma = quantPecas1 * valorUndPecas1 + quantPecas2 * valorUndPecas2;

        System.out.printf("Valor total a pagar é de:R$ %.2f ", soma);

    }
}
