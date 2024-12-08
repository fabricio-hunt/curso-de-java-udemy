public class DoWhile {
    public static void main(String[] args) {
        //O do-while é uma estrutura de repetição em Java que garante que o bloco de código seja executado pelo menos uma vez,
        // mesmo que a condição seja falsa desde o início. Ele é usado quando você quer executar um bloco de código e só
        // depois verificar se deve continuar ou parar.
        /*
        do {
            // Bloco de código a ser executado
        } while (condição);
        */

            /*do: Indica o início do bloco de código que será executado.
            Bloco de código: Contém as instruções que serão executadas.
            while (condição): Após a execução do bloco, verifica se a condição é verdadeira. Se for, o código dentro do do será executado novamente; se não, o laço termina.
            Diferença principal entre while e do-while
            while: Verifica a condição antes de executar o bloco de código.
            do-while: Executa o bloco de código pelo menos uma vez, depois verifica a condição. */

        int contador = 1;

        do {
            System.out.println("Número: " + contador);
            contador++; // Incrementa o contador
        } while (contador <= 5);
                }
}
