import java.util.Scanner;

public class ExercicioFor1 {
    public static void main(String[] args) {
        /* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso. */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro (1 <= X <= 1000): " );
        int x = scanner.nextInt();

        if (x < 1 || x > 1000){
            System.out.println("O número deve estar entre 1 e 1000.");
        } else {
            for(int i = 1; i <= x; i++){
                if( i % 2 != 0){
                    System.out.println(i);

                }

            }
        }
            scanner.close();
        }
    }



