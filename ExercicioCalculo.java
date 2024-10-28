import java.util.Scanner;

public class ExercicioCalculo {
    public static void main(String[] args) {

        /*  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
            casas decimais conforme exemplos.  */

        //Variáveis
        double pi = 3.14159;

        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        double raio = scanner.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("O valor da área é %.4f: ",  area);




    }
}
