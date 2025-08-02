
public class Post implements Comparable<Post> {
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categorias;

    public Post(Autor autor, String titulo, String corpo, Categorias categorias) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categorias = categorias;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    @Override
    public int compareTo(Post outraConta) {
        return this.titulo.compareTo(outraConta.titulo);
    }


}