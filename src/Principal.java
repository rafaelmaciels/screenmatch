public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Interestelar";
        meuFilme.categoria = "Ficção Cientifica";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.duracaoEmMinutos = 240;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("A Média da avaliações do filme é: " + meuFilme.pegaMediaAvaliacoes());
    }
}
