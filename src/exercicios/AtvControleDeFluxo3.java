package exercicios;

import java.util.Scanner;

public class AtvControleDeFluxo3 {
    public static void main(String[] args) {
        // 3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        Scanner leitura = new Scanner(System.in);


        int escolha = 0;

        while (escolha !=3) {
            System.out.println("""
                    *Menu*
                    Escolha 1 para calcular a área de um quadrado
                    Escolha 2 para calcular a área de um círculo
                    Escolha 3 para sair
                    """);
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do circulo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }

        leitura.close();
    }
}
