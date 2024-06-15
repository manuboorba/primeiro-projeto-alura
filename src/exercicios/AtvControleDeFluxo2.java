package exercicios;

import java.util.Scanner;

public class AtvControleDeFluxo2 {
    public static void main(String[] args) {

        // 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        int numero1 = 0;
        int numero2 = 0;
        Scanner leituraNumeros = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        numero1 = leituraNumeros.nextInt();
        System.out.println("Insira outro número inteiro");
        numero2 = leituraNumeros.nextInt();

        if (numero1 == numero2){
            System.out.println("Os números são iguais");
        } else if (numero1 < numero2) {
            System.out.println("Números diferentes. Número 1 é menor do que o número 2.");
        } else if (numero1 > numero2) {
            System.out.println("Números diferentes. Número 1 é maior do que o número 2.");
        }


    }
}
