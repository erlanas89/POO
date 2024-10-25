public class Livro {
    String titulo, descricao, isbn, nomeDoAutor, emailDoAutor, cpfDoAutor;
    double valor;
    void mostraDetalhes(){
        System.out.println("Detalhes do Livro");
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
    }

}
