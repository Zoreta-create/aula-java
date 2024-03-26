package aula04.exemplos;

import java.util.Scanner;

/**
 * Exemplos01
 */
public class Exemplos01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int diaDaSemana;

        System.out.println("Informe o dia da semana: (1..7):");
        diaDaSemana = entrada.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
                case 2:
                System.out.println("Terça-feira");
                break;
                case 3:
                System.out.println("Quarta-feira");
                break;
                case 4:
                System.out.println("Quinta-feira");
                break;
                case 5:
                System.out.println("Sexta-feira");
                break;
                case 6:
                System.out.println("Sábado");
                break;
                case 7:
                System.out.println("Domingo");
                break;
        
            default:
            System.out.println("Opção Inválida!");
                //break; não obrigatório
        }
        entrada.close();
    } 
}