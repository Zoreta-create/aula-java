package aula05.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, soma, media, notaExame, notaFinal;
        int falta = 16;

        System.out.println("Digite sua primeira nota abaixo: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota abaixo:");
        nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota abaixo:");
        nota3 = sc.nextDouble();
        System.out.println("Digite sua quantidade de faltas: ");
        falta = sc.nextInt();

        soma = nota1 + nota2 + nota3;
        media = soma / 3;

        if (falta >= 16) {
            System.out.println("Você está reprovado por faltas!");
        } else if (media >= 6) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Qual foi a nota do exame: ");
            notaExame = sc.nextDouble();
            notaFinal = (media + notaExame) / 2;

            if (notaFinal >= 5) {
                System.out.println("Você foi aprovado!");
            } else {
                System.out.println("Você está reprovado.");
            }
        }

        sc.close();
    }
}
