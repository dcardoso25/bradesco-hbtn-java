import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Blog {

    private ArrayList<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new HashSet<>();
        for (int i = 0; i < posts.size(); i++) {
            autores.add(posts.get(i).getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Set<String> autores = obterTodosAutores();
        Map<String, Integer> contagem = new HashMap<>();

        for (String autor : autores) {
            int postagens = 0;
            for (int i = 0; i < posts.size(); i++) {
                String autorDaPostagem = posts.get(i).getAutor();
                if (autor.equals(autorDaPostagem)) {
                    postagens ++;
                }
            }
            contagem.put(autor, postagens);
        }
        return contagem;
    }
}