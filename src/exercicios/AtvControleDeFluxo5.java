package exercicios;

import java.util.Scanner;

public class AtvControleDeFluxo5 {
    public static void main(String[] args) {
        // 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else if (numero % 2 != 0) {
            System.out.println("Número impar!");
        } else {
            System.out.println("Número inválido!");
        }

    }
}
