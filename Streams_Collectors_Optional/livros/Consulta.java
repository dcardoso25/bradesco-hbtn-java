import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> produtos = pedido.getProdutos();
        return produtos.stream()
                .filter(e -> e.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }
}
