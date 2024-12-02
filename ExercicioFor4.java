import java.util.Scanner;
        /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */
public class ExercicioFor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Nemero de N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++ ){
            System.out.println("Digite o numero de X: ");
            int x = scanner.nextInt();

            System.out.println("Digite o numero de y: ");
            int y = scanner.nextInt();

            if (y == 0){
                System.out.println("Divisão impossível");
            }

            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }



        scanner.close();
    }
}

