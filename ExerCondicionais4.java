import java.util.Scanner;

public class ExerCondicionais4 {
    public static void main(String[] args) {
        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o horário de entrada? ");
        int horarioEntrada = scanner.nextInt();

        System.out.println("Qual o horário de saída?");
        int horarioSaida = scanner.nextInt();


        if(horarioEntrada == horarioSaida){
            int duracao = 24;
            System.out.println("O Jogo Durou: " + duracao + " HORA(S)");
        }

        else if (horarioEntrada < horarioSaida ){
            int duracao = horarioSaida - horarioEntrada;
            System.out.println("O Jogo Durou: " + duracao + " HORA(S)");
        }

        else{
            //duracao = (24 - hora_inicial) + hora_final
            int duracao = (24 - horarioEntrada) + horarioSaida;
            System.out.println("O Jogo Durou: " + duracao + " HORA(S)");
        }
    }
}


