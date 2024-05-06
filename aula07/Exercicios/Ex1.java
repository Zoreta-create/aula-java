package aula07.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber, playerNumber; 
        int tentativas = 0;
        
 
        randomNumber = random.nextInt(10);
        System.out.println("Digite um número de 0 até 10 para ver a sua sorte: ");
        playerNumber = scanner.nextInt();

        if (playerNumber == randomNumber) {
            System.out.println("Parabéns! você passou para a segunda fase!");
            tentativas++;
        } else {
            System.out.println("Game Over! você não passou de fase :( " + "O número correto é: " + randomNumber); 
            scanner.close();
            return;
        }

       // Segunda fase
       randomNumber = random.nextInt(10) + 1; // Novo número aleatório para a segunda fase
       System.out.println("Bem-vindo à segunda fase! Digite um número de 0 até 10: ");

       while (true) {
           playerNumber = scanner.nextInt();
           tentativas++;

           if (playerNumber < randomNumber) {
               System.out.println("O número da sorte é maior. Tente novamente: ");
           } else if (playerNumber > randomNumber) {
               System.out.println("O número da sorte é menor. Tente novamente: ");
           } else {
               System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");
               break; // Saindo do loop quando o jogador acerta o número
           }

           // terceira fase
       }
       scanner.close(); // Fechando o scanner após o término do jogo
   }
}