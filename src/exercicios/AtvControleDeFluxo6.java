package exercicios;

import java.util.Scanner;

public class AtvControleDeFluxo6 {
    public static void main(String[] args) {
        // 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
