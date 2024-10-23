import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        // Criando o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Lendo um número inteiro
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Lendo um número decimal
        System.out.println("Digite um número decimal:");
        double decimal = scanner.nextDouble();

        // Lendo uma string
        scanner.nextLine(); // Consumindo a quebra de linha
        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();

        scanner.nextLine();
        System.out.println("Digite um resumo do assunto: ");
        String resumo = scanner.nextLine();

        // Exibindo os dados lidos
        System.out.println("Número inteiro: " + numero);
        System.out.println("Número decimal: " + decimal);
        System.out.println("Texto: " + texto);
        System.out.println( "Este é o seu resumo " + resumo);

        // Fechando o Scanner
        scanner.close();
    }
}
