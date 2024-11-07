import java.util.Scanner;

public class ExerCondicionais2 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int resultado = scanner.nextInt();

        if (resultado % 2 == 0){
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
    }
}
