package DesafioHoraDaPratica2;
//Desenvolva uma classe Livro com os atributos privados titulo e autor.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um metodo exibirDetalhes que imprime o título e o autor do livro.
public class Livro {

    private String autor;
    private String titulo;

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public void exibirInformacoesDetalhadasDoLivro() {
        System.out.println(String.format("""
                Autor do livro: %s
                Título do livro: %s
                """,getAutor(), getTitulo()));
    }
}
