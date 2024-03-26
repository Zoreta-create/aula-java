import java.util.Scanner;

/**
 * Exercicio02
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int DigiteSeuSalario;
        double salario, porcent;
        

        System.out.println("Digite o seu salário abaixo:");
        DigiteSeuSalario = teclado.nextInt();

        salario = 1 + 0.25;
        porcent = salario * DigiteSeuSalario;

        System.out.println("Seu salário ajustado é: " + porcent);
        teclado.close();
    }

    
}