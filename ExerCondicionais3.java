import java.util.Scanner;

public class ExerCondicionais3 {
    public static void main(String[] args) {

        /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente.*/

        //Se a % b == 0, então "a é múltiplo de b"
        //Senão, "a não é múltiplo de b"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        // permite os valores inversos
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
