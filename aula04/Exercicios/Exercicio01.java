package aula04.Exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDigitado;


        System.out.println("Informe um número para saber se ele é ímpar ou par: ");
        numeroDigitado = teclado.nextInt();
        if (numeroDigitado % 2 ==0) {
            System.out.println("Você digitou um número par");
        } else {
            System.out.println("Você digitou um número ímpar");
        }

        teclado.close();
    }
}