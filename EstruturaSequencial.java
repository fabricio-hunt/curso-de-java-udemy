import java.util.Locale;
import java.text.NumberFormat;

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

        /* Aula Saída de Dados */

        String nome = "Jonas de Sá";
        int idade = 31;
        double matricula = 10.35784;
        float renda = 4500.00f;

        // Configura a formatação numérica para ponto decimal
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);

        // Configura a formatação de moeda para BRL
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("----------------Seu Contracheque----------------");
        System.out.printf("Olá %s, sua idade é: %d anos, sua matrícula é: %s e sua renda é: %s%n",
                nome, idade,
                numberFormat.format(matricula),
                currencyFormat.format(renda));
    }

    }





