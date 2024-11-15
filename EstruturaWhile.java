public class EstruturaWhile {
    public static void main(String[] args) {
        /*Em Java, a estrutura while é usada para executar repetidamente um bloco de código enquanto uma condição específica é verdadeira.
        Ela verifica a condição antes de entrar no loop, então, se a condição for falsa desde o início, o loop não será executado nenhuma vez.  */

        int contador = 1; // Inicia o contador em 1

        while (contador <= 5) { // Condição para o loop continuar
            System.out.println("Contador: " + contador); // Imprime o valor atual do contador
            contador++; // Incrementa o contador
        }
    }
}
