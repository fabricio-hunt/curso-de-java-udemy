import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    decimais. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Funcionário - Digite Sua Matrícula: ");
        int matricula = scanner.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite seu valor hora: ");
        double valorHora = scanner.nextDouble();

        double salarioFuncionario = horasTrabalhadas * valorHora;

        System.out.printf("Olá Funcionário %d o seu salário é de R$ %.2f", matricula, salarioFuncionario );

    }
}
