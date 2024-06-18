import java.util.Scanner;

public class DesafioSwitch {
    public static void main(String[] args) {
        String nome = "Manuela Cavalcanti";
        double saldo = 2500;
        double valor = 0;
        int operacao = 0;
        Scanner leituraOperacao = new Scanner(System.in);
        Scanner leituraDouble = new Scanner(System.in);

        System.out.println("""
                Operações:
                Digite 1 para consultar seu saldo
                Digite 2 para receber um valor
                Digite 3 para transferir um valor
                Digite 4 para sair
                """);
        operacao = leituraOperacao.nextInt();

        switch (operacao) {
            case 1:
                System.out.println(saldo);
                break;
            case 2:
                System.out.println("Qual valor deseja receber?");
                valor = leituraDouble.nextDouble();
                saldo += valor;
                System.out.println("Agora seu saldo é: " + saldo);
                break;
            case 3:
                System.out.println("Qual valor deseja transferir?");
                valor = leituraDouble.nextDouble();
                if (saldo < valor)
                {
                    System.out.println("Saldo insuficiente!");
                    return;
                }
                if (saldo > valor)
                {
                    saldo -= valor;
                    return;
                }
                System.out.println("Agora seu saldo é: " + saldo);
                break;
            case 4:
                System.out.println("Programa encerrado");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
