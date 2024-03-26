package aula04.exemplos;

/**
 * Exemplo02
 */
public class Exemplo02 {

    public static void main(String[] args) {
        //OPERADOR TERNÁRIO
        int numero = 5;
        int resposta;

        resposta = (numero > 5)? numero * 10 : numero * 2;
        System.out.println("Resposta: " + resposta);
    }
}