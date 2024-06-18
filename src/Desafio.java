import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Manuela Cavalcanti";
        double saldo = 2500;
        double valor = 0;
        int operacao = 0;
        Scanner leituraOperacao = new Scanner(System.in);
        Scanner leituraDouble = new Scanner(System.in);


        while (operacao != 4) {
            System.out.println("""
                Operações:
                Digite 1 para consultar seu saldo
                Digite 2 para receber um valor
                Digite 3 para transferir um valor
                Digite 4 para sair
                """);
            operacao = leituraOperacao.nextInt();

            if (operacao == 1){
                System.out.println(saldo);
            } else if (operacao == 2) {
                System.out.println("Qual valor deseja receber?");
                valor = leituraDouble.nextDouble();
                saldo += valor;
                System.out.println("Agora seu saldo é: " + saldo);
            } else if (operacao == 3 && saldo > valor) {
                System.out.println("Qual valor deseja transferir?");
                valor = leituraDouble.nextDouble();
                saldo -= valor;
                System.out.println("Agora seu saldo é: " + saldo);
            } else if (operacao == 3 && saldo < valor) {
                System.out.println("Saldo insuficiente!");
            } else if (operacao == 4) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida!");
            }

        }

        leituraDouble.close();
        leituraOperacao.close();


    }
}
