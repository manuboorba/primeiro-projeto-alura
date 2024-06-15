package exercicios;

import java.util.Scanner;

public class AtvControleDeFluxo1 {
    public static void main(String[] args) {

        // 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        int numero = 0;
        Scanner leituraNumero = new Scanner(System.in);
        System.out.println("Digite um número positivo ou negativo");
        numero = leituraNumero.nextInt();

        if (numero < 0){
            System.out.println("Número negativo!");
        } else {
            System.out.println("Número positivo");
        }
    }
}
