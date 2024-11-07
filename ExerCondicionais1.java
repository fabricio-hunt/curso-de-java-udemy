import java.util.Scanner;

public class ExerCondicionais1 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int resultado = scanner.nextInt();

        if (resultado < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }
    }
}
