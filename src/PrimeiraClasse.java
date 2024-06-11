public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano do lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double notaDoFilmeJaqueline = 9.8;
        double notaDoFilmePaulo = 6.1;
        double notaDoFilmeManu = 7.0;
        double media = (notaDoFilmeJaqueline + notaDoFilmePaulo + notaDoFilmeManu) /3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80.
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);

    }
}