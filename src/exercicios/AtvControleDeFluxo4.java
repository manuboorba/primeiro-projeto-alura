package exercicios;

import java.util.Scanner;


public class AtvControleDeFluxo4 {
    public static void main(String[] args) {
        // 4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i =1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
         }
    }

}
