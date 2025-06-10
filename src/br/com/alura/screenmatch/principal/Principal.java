package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interestelar", 2014);
        meuFilme.setCategoria("Ficção Cientifica");
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

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(12);
        lost.setEpisodiosPorTemporada(7);
        lost.setMinutosPorEpisodio(60);
        System.out.println("Média de duração em minutos: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Efeito Borboleta", 2014);
        outroFilme.setCategoria("Ficção Cientifica");
        outroFilme.setDuracaoEmMinutos(184);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("O total de minutagens do lost é :" + calculadora.getTempoTotal());

        Classificavel.FiltroRecomendacao filtro = new Classificavel.FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(); // Null está dando erro ao inserir o nome da Serie.
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoRafael = new Filme("As traças do rei careca", 1880);
        //filmeDoRafael.setNome("As tranças do Rei Careca");
        filmeDoRafael.setDuracaoEmMinutos(160);
        filmeDoRafael.avalia(10);

        // Array List

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoRafael);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilme.size());
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme: " + listaDeFilme.get(0).toString());

        

    }
}
