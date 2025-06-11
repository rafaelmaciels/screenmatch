package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interestelar", 2014);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Efeito Borboleta", 2014);
        outroFilme.avalia(9);
        var filmeDoRafael = new Filme("As traças do rei careca", 1880);
        filmeDoRafael.avalia(8);
        Serie lost = new Serie("Lost", 2000);



        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoRafael);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Rafael");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação alfabetica: " + buscaPorArtista);
        Collections.sort(lista);
        System.out.println("List de titulos ordenados: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando lista por ano:" + lista);
    }
}
