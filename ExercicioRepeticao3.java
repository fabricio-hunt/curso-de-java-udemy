
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.   */

import java.util.Scanner;

public class ExercicioRepeticao3 {
    public static void main(String[] args) {
        // Variáveis para armazenar as contagens
        int alcool = 0; // Contagem de Álcool
        int gasolina = 0; // Contagem de Gasolina
        int diesel = 0; // Contagem de Diesel

        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Exibição inicial do menu
        System.out.println("""
                Selecione uma opção:
                1. Álcool
                2. Gasolina
                3. Diesel
                4. Fim
                """);

        // Loop para leitura até o usuário digitar 4
        while (true) { // Loop infinito controlado por condição de saída
            System.out.print("Digite o tipo de combustível: ");
            opcao = scanner.nextInt();

            // Validar a entrada e atualizar as contagens
            if (opcao == 1) {
                alcool++; // Incrementa o contador de Álcool
            } else if (opcao == 2) {
                gasolina++; // Incrementa o contador de Gasolina
            } else if (opcao == 3) {
                diesel++; // Incrementa o contador de Diesel
            } else if (opcao == 4) {
                // Finaliza o programa
                break; // Sai do loop
            } else {
                // Entrada inválida
                System.out.println("Opção inválida! Digite um número entre 1 e 4.");
            }
        }

        // Mensagem final e exibição das contagens
        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
