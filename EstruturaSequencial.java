import java.util.Locale;

public class EstruturaSequencial {
    public static void main(String[] args) {
        /*
        ----------------------------------------------
        Aula Expressões aritiméticas - ok

        Variáveis Sintaxe:
        <tipo> <nome> = <valor inicial>
        int idade = 25;
        char sexo = 'F';
        Uma variável possui:
        - nome
        - tipo
        - valor
        - endereço
        -----------------------------------------------
         */

        /* Saída de Dados */

        String nome = "Jonas de Sá";
        int idade = 31;
        double matricula = 10.35784;
        float renda = 4.500f;
        Locale locale = new Locale("pt", "BR");



        System.out.println("-------------------Seu Contracheque-----------------");
        System.out.printf("Olá %s, sua idade é: %d anos, sua matricula é: %f e sua renda é: R$ %f reais%n", nome, idade, matricula, renda);

    }
}




