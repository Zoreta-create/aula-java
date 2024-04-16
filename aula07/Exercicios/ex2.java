package aula07.Exercicios;

import java.util.Random;
import java.util.Scanner;
import java util.Random;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rollDice1 = random.nextInt(6) + 1;
        int rollDice2 = random.nextInt(6) + 1;
        int sum;

        System.out.println("Bem vindo ao jogar dados. Aperte enter para jogar os dados!");
        scanner.nextLine();

        System.out.println(rollDice1);
        System.out.println(rollDice2);

        sum = rollDice1 + rollDice2;

        if (sum == 7 || sum == 11) {
            System.out.println("Parabéns! você acertou os dois dados");
        } else if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("Você perdeu! jogue os dados novamente.");
        }
        
    }
}
