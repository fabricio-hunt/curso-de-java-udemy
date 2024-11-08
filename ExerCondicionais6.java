import java.util.Scanner;

public class ExerCondicionais6 {
    public static void main(String[] args) {
        //Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do intervalo: ");
        double intervalo = scanner.nextDouble();

        if (intervalo <= 25) {
            System.out.printf("Intervalo entre 0 a 25 --> VALOR %.0f  : ", intervalo);
        }
        else if (intervalo >=25 && intervalo <=50 ) {
            System.out.printf("Intervalo entre 25 a 50 --> VALOR %.0f  : ", intervalo);
        }
        else if (intervalo >=50 && intervalo <=75) {
            System.out.printf("Intervalo entre 50 a 75 --> VALOR %.0f  : ", intervalo);
        }
        else if (intervalo >=75 && intervalo <=100) {
            System.out.printf("Intervalo entre 75 a 100 --> VALOR %.0f  : ", intervalo);
        }
        else {
            System.out.println("Fora do intervalo!");
        }
    }
}
