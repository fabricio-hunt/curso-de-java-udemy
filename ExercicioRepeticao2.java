import java.util.Scanner;

public class ExercicioRepeticao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leitura das coordenadas X e Y
            System.out.print("Digite o valor de X: ");
            int x = scanner.nextInt();
            System.out.print("Digite o valor de Y: ");
            int y = scanner.nextInt();

            // Verificação de parada
            if (x == 0 || y == 0) {
                break; // Encerra o programa
            }

            // Determinação do quadrante
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
        }

        scanner.close(); // Fecha o scanner
    }
}
