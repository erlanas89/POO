public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livroJava = new Livro();
        livroJava.titulo = "Java como Programar";
        livroJava.descricao ="Primeiros passos ...";
        livroJava.valor = 59.90;
        livroJava.isbn = "987-65-4321-3";

        Livro livroPython = new Livro();
        livroPython.titulo = "Python como Programar";
        livroPython.descricao ="Primeiros passos ...";
        livroPython.valor = 59.90;
        livroPython.isbn = "987-65-4321-3";

        livroPython.mostraDetalhes();
        livroJava.mostraDetalhes();
    }
}
