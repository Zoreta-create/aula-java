package Procopio;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

class Estudante {
   private String nome;
   private double notaN1;
   private double notaN2;
   
   public Estudante (String nome, double notaN1, double notaN2) {
       this.nome = nome;
       this.notaN1 = notaN1;
       this.notaN2 = notaN2;
   }
   
   public double calcularMediaFinal() {
       return (notaN1 * 0.4) + (notaN2 * 0.6);
   }
   
   public String getNome(){
       return nome;
   }
   
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       Estudante estudantes [] = new Estudante[5];
       
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do estudante: ");
            String nome = teclado.nextLine();

            try {
            System.out.println("Digite sua primeira nota: ");
            double notaN1 = teclado.nextDouble();
            System.out.println("Digite sua segunda nota: ");
            double notaN2 = teclado.nextDouble();

            if (notaN1 < 0 || notaN1 > 10 || notaN2 < 0 || notaN2 > 10 ) {
                throw new IllegalArgumentException("As notas devem estar entre 0 e 10");
            }

            Estudante estudante = new Estudante(nome, notaN1, notaN2);
            estudante.add();

        } catch (InputMismatchException erro) {
            System.out.println("Entrada inválida! Tente novamente.");
            teclado.nextLine();
            i--;
        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido! " + e.getMessage());
            i--;
        }

        teclado.close();
    }
   
    System.out.println("Estudantes criados com sucesso: ");
        for (Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome() + ", Média final: " + estudante.calcularMediaFinal());
        } 
    }


}

