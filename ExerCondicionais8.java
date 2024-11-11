import java.util.Scanner;

public class ExerCondicionais8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário R$: ");
            double salario = scanner.nextDouble();
            double imposto = 0.0;

            if (salario <= 2000.0) {
                imposto = 0.0;
            } else if (salario <= 3000.0) {
                imposto = (salario - 2000.0) * 0.08;
            } else if (salario <= 4500.0) {
                imposto = (1000.0 * 0.08) + ((salario - 3000.0) * 0.18);
            } else {
                imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salario - 4500.0) * 0.28);
            }

            if (imposto == 0.0) {
                System.out.println("Isento");
            } else {
                System.out.printf("R$ %.2f%n", imposto);
            }
            scanner.close();
        }
    }

