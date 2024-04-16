package aula07.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber, playerNumber; 
        int tentativas = 0;
        int palpite = 0;
 
        randomNumber = random.nextInt(10);
        System.out.println("Digite um número de 0 até 10 para ver a sua sorte: ");
        playerNumber = scanner.nextInt();

        if (playerNumber == randomNumber) {
            System.out.println("Parabéns! você passou para a segunda fase!");
        } else {
            System.out.println("Game Over! você não passou de fase :( " + "O número correto é: " + randomNumber); 
        }

        while (palpite != randomNumber) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < randomNumber) {
                System.out.println("O número é maior. Tente novamente.");
            } else if (palpite > randomNumber) {
                System.out.println("O número é menor. Tente novamente.");
            } else {
                System.out.println("Parabéns! você acertou o número e passou para a fase 3.");
            }
        }
        scanner.close();
    }

}
