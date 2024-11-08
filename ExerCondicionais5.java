import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerCondicionais5 {
    public static void main(String[] args) {
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#,##0.00");

        System.out.println("+------------------+----------------------+-----------+");
        System.out.println("| CÓDIGO           | ESPECIFICAÇÃO       | PREÇO     |");
        System.out.println("+------------------+----------------------+-----------+");
        System.out.println("| 1                | Cachorro Quente     | R$ 4.00   |");
        System.out.println("| 2                | X-Salada            | R$ 4.50   |");
        System.out.println("| 3                | X-Bacon             | R$ 5.00   |");
        System.out.println("| 4                | Torrada simples     | R$ 2.00   |");
        System.out.println("| 5                | Refrigerante        | R$ 1.50   |");
        System.out.println("+------------------+----------------------+-----------+");

        System.out.println("Digite a Opção: ");
        int opcao = scanner.nextInt();

        System.out.println("Digite a Quantidade: ");
        int quantidade = scanner.nextInt();


        if(opcao == 1){
            double valor = quantidade * 4;
            System.out.println("Total R$: " + formato.format(valor));
        }
        else if(opcao == 2){
            double valor = quantidade * 4.50;
            System.out.println("Total R$: " + formato.format(valor));
        }
        else if(opcao == 3){
            double valor = quantidade * 5;
            System.out.println("Total R$: " + formato.format(valor));
        }
        else if(opcao == 4){
            double valor = quantidade * 2;
            System.out.println("Total R$: " + formato.format(valor));
        }
        else if(opcao == 5){
            double valor = quantidade * 1.50;
            System.out.println("Total R$: " + formato.format(valor));
        }
    }
}
