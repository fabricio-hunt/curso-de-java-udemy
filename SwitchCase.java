public class SwitchCase {
    public static void main(String[] args) {
        /*  Em Java, o comando switch é usado para executar diferentes blocos de código com base no valor de uma expressão,
        geralmente uma variável. A instrução switch facilita a leitura e a organização do código, especialmente quando se está
        lidando com várias condições baseadas no valor de uma única variável. O switch suporta tipos de dados como int, String, char e alguns tipos enum. */

        int dia = 3;

        String nomeDoDia;
        switch (dia) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Dia inválido";
                break;
        }

        System.out.println("O dia correspondente é: " + nomeDoDia);
    }
}

