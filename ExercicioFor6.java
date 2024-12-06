import java.util.Scanner;
//Ler um número inteiro N e calcular todos os seus divisores.

public class ExercicioFor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Leia o valor de N: ");
        int n = scanner.nextInt();

        for (int i =1; i <= n ; i++){
            if( n % i  == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
