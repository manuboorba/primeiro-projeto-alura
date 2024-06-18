import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Manuela Cavalcanti";
        String tipoDeConta = "Corrente";
        double saldo = 2500;
        double valor = 0;
        int operacao = 0;
        Scanner leitura = new Scanner(System.in);


        String msg = String.format("Olá, %s! Sua conta é %s e seu saldo é %.2f", nome, tipoDeConta, saldo);
        System.out.println(msg);

        /* ou::
        System.out.printf("Olá,  %s! Sua conta é %s e seu saldo é %.2f", nome, tipoDeConta, saldo);
         */


        while (operacao != 4) {
            System.out.println("""
                Operações:
                Digite 1 para consultar seu saldo
                Digite 2 para receber um valor
                Digite 3 para transferir um valor
                Digite 4 para sair
                """);
            operacao = leitura.nextInt();

            if (operacao == 1){
                System.out.println("O saldo é: " + saldo);
            } else if (operacao == 2) {
                System.out.println("Qual valor deseja receber?");
                valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Agora seu saldo é: " + saldo);
            } else if (operacao == 3) {
                System.out.println("Qual valor deseja transferir?");
                valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Seu novo saldo é: " + saldo);
                }

            } else if (operacao == 4) {
                System.out.println("Programa encerrado");
            } else if (operacao != 4){
                System.out.println("Opção inválida!");
            }

        }

        leitura.close();



    }
}
