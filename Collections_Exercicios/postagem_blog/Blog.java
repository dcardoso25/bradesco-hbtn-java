import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Comparator;
import java.lang.*;

public class Blog {

    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        String autor = post.getAutor().getNome();
        String titulo = post.getTitulo();

        for (int i = 0; i < posts.size(); i++) {
            Post post1 = posts.get(i);
            String autor1 = post1.getAutor().getNome();
            String titulo1 = post1.getTitulo();
            if (autor.equals(autor1) && titulo.equals(titulo1)) {
                throw new IllegalStateException("Postagem jah existente");
            }
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (int i = 0; i < posts.size(); i++) {
            autores.add(posts.get(i).getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Set<Categorias> categorias = new HashSet<>();
        for (int i = 0; i < posts.size(); i++) {
            categorias.add(posts.get(i).getCategorias());
        }
        Map<Categorias, Integer> contagem = new HashMap<>();

        for (Categorias categoria : categorias) {
            int postagens = 0;
            for (int i = 0; i < posts.size(); i++) {
                Categorias categoriaDaPostagem = posts.get(i).getCategorias();
                if (categoria.equals(categoriaDaPostagem)) {
                    postagens ++;
                }
            }
            contagem.put(categoria, postagens);
        }
        Map<Categorias, Integer> sortedMap = new TreeMap<>(contagem);

        return sortedMap;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getAutor().getNome().equals(autor.getNome())) {
                postsPorAutor.add(posts.get(i));
            }
        }
        return postsPorAutor;

    }

    public Set<Post> obterPostsPorCategoria(Categorias categorias) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (int i = 0; i < posts.size(); i++) {
            if (posts.get(i).getCategorias().equals(categorias)) {
                postsPorCategoria.add(posts.get(i));
            }
        }
        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategorias = new TreeMap<>();

        for (int i = 0; i < posts.size(); i++) {
            Categorias categoria = posts.get(i).getCategorias();
            // Busca ou cria o Set
            postsPorCategorias.computeIfAbsent(categoria, k -> new TreeSet<>()).add(posts.get(i));
        }

        return postsPorCategorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();

        for (int i = 0; i < posts.size(); i++) {
            Autor autor = posts.get(i).getAutor();
            // Busca ou cria o Set
            postsPorAutor.computeIfAbsent(autor, k -> new TreeSet<>()).add(posts.get(i));
        }

        return postsPorAutor;
    }
}