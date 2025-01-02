public class MetodoCalculadora {
    /* O que é um método em Java?
Um método em Java é um bloco de código que realiza uma tarefa específica. Ele pode ser reutilizado várias vezes ao ser chamado em diferentes partes
do programa. Métodos podem receber parâmetros e retornar valores.

Estrutura de um método em Java: */
    // Método que soma dois números
    public int somar(int numero1, int numero2) {
        // Realiza a soma
        return numero1 + numero2;
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Instancia a classe Calculadora
        Calculadora calc = new Calculadora();

        // Chama o método somar e armazena o resultado
        int resultado = calc.somar(5, 10);

        // Exibe o resultado
        System.out.println("A soma é: " + resultado);
    }
}
