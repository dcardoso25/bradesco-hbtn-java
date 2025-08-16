import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Comparator;

public class Blog {

    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (int i = 0; i < posts.size(); i++) {
            autores.add(posts.get(i).getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Set<String> categorias = new HashSet<>();
        for (int i = 0; i < posts.size(); i++) {
            categorias.add(posts.get(i).getCategoria());
        }
        Map<String, Integer> contagem = new HashMap<>();

        for (String categoria : categorias) {
            int postagens = 0;
            for (int i = 0; i < posts.size(); i++) {
                String categoriaDaPostagem = posts.get(i).getCategoria();
                if (categoria.equals(categoriaDaPostagem)) {
                    postagens ++;
                }
            }
            contagem.put(categoria, postagens);
        }
        Map<String, Integer> sortedMap = new TreeMap<>(contagem);

        return sortedMap;
    }
}