public class Filme {
    String nome;
    String categoria;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // Medoto
    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Filme incluso no plano? " + incluidoNoPlano);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
