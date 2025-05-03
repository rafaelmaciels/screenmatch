import br.com.alura.screenmatch.FiltroRecomendacao;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Episodio;
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
        serie.setEpisodiosPorTemporada(7);
        serie.setMinutosPorEpisodio(60);
        System.out.println("Média de duração em minutos: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Efeito Borboleta");
        outroFilme.setCategoria("Ficção Cientifica");
        outroFilme.setDuracaoEmMinutos(184);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println("O total de minutagens do serie é :" + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(); // Null está dando erro ao inserir o nome da Serie.
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
