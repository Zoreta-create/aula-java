package aula06.Exercicios;

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        int cont, digiteOValor;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 até 100:");
        digiteOValor = keyboard.nextInt();
        
        cont = 1;

        if (digiteOValor >= 1 && digiteOValor <= 100) {
            while (cont <= digiteOValor) {
                System.out.println(cont + " ");
                cont++;
            }
        } else {
            System.out.println("Número inválido!");
        }
        keyboard.close();
    }
}
