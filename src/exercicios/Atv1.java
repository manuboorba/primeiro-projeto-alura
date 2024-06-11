package exercicios;

public class Atv1 {
    public static void main(String[] args) {

        // 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 7.3;
        double nota2 = 4.8;
        double media = (nota1 + nota2) /2;
        System.out.println(media);

        // 2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double variavel1 = 4.67;
        int variavel2 = 7;
        int resultado = (int) variavel1 + variavel2;
        System.out.println(resultado);

        // 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra =  'G';
        String nome = "abriel";
        System.out.println(letra + nome);

        // 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 95.50;
        int quantidade = 3;
        double multiplicacao = (precoProduto * quantidade);
        System.out.println(multiplicacao);

        // 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 67.75;
        double valorEmReais = valorEmDolares * 4.94;
        String conversao = String.format("%.2f", valorEmReais);
        System.out.println(conversao);

        // 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 43.50;
        double percentualDesconto = 10;
        double valorDesconto = (percentualDesconto/100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.println(novoPreco);

    }
}
