import java.util.Scanner;

public class CalculaTrinangulo {
    public static void main(String[] args) {
        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;

        System.out.println("Digite o valor 1: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor 2: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor 3: ");
        double c = scanner.nextDouble();

        System.out.println("Triângulo: " + (a * c)/2);
        System.out.println("Circulo: " + pi * c * c);
        System.out.println("Trapezio: " + ((a + b) * c) /2 );
        System.out.println("Quadrado: " + b * b );
        System.out.println("Retangulo: " +  a * b);


    }
}
