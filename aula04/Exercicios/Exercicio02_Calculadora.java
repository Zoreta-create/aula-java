package aula04.Exercicios;

import java.util.Scanner;

public class Exercicio02_Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2, resposta = 0;
        char operacao;
        boolean sucesso = true;


        // entrada de dados
        System.out.print("Digite o primeiro número:");
        valor1 = teclado.nextDouble();
        System.out.print("Digite o primeiro número:");
        valor2 = teclado.nextDouble();
        teclado.nextLine(); // limpa o ENTER do teclado
        System.out.println("digite a operação(+ - * /):"); //pega o primeiro char especial

        operacao = teclado.nextLine().charAt(0);

        // processamento
        switch (operacao) {
            case '+':
                resposta = valor1 + valor2;                
                break;
            case '-':
                resposta = valor1 - valor2;                
                break;
            case '*':
                resposta = valor1 * valor2;                
                break;
            case '/':
               if (valor2 != 0) {
                resposta = valor1 / valor2;
               } else {
                System.out.println("Divisão por zero!");
                sucesso = false;
               }
                break;             
        
            default:
            System.out.println("Operador Inválido!");
            sucesso = false;
                break;
        }
        // saída
              
        if (sucesso == true) {
            System.out.println(valor1 + " " + operacao + " " + valor2 + " = " + resposta);
        }

        teclado.close();
    }
}
