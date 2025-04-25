import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Interestelar");
        meuFilme.setCategoria("Ficção Cientifica");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(240);
        meuFilme.setIncluidoNoPlano(true
        );


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaAvaliacoes());
        System.out.println("A Média da avaliações do filme é: " + meuFilme.pegaMediaAvaliacoes());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(12);
        serie.setEpisodiosPorTemrpora(7);
        serie.setMinutosPorEpisodio(45);
        System.out.println("Média de duração em minutos: " + serie.getDuracaoEmMinutos());
    }
}
