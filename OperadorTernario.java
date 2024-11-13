public class OperadorTernario {
    public static void main(String[] args) {
        //Em Java, o operador ternário é uma forma simplificada de um if-else,
        // permitindo que você atribua um valor a uma variável com base em uma condição,
        // tudo em uma única linha. A estrutura do operador ternário é:

        // variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;

        int idade = 19;
        String mensagem;

        // Usando o operador ternário
        mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(mensagem); // Saída: Maior de idade
    }
}
