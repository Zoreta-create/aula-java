package aula06.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int valorDigitado, i;

        System.out.println("Digite um número para gerar a tabuada:");
        valorDigitado = keyboard.nextInt();

        i = 1;

        while (i<=10) {
            System.out.println(valorDigitado + " x " + i + " = " + (valorDigitado * i));
            i++;
        }
        keyboard.close();
    }
}
