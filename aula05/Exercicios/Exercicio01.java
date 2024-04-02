package aula05.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
        int media, soma, nota1, nota2;

        System.out.println("Digite sua primeira nota: ");
        nota1 = teclado.nextInt();
        System.out.println("Digite sua segunda nota: ");
        nota2 = teclado.nextInt();
        //teclado.nextLine();

        soma = nota1 + nota2;

        //System.out.println("A soma das duas notas são: " + soma);
        media = soma / 2;
        System.out.println("Sua média é: " + media);


        if (media >= 7) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else if (media >= 5 && media < 7){
            System.out.println("Você está de exame...");
        } else {
            System.out.println("Você foi reprovado!");
        }

        teclado.close();
    }
    
}
