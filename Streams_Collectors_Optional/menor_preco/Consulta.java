import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> produtos = pedido.getProdutos();
        return produtos.stream()
                .filter(e -> e.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        Optional<Produto> produtoMaiorPreco = produtos.stream()
                .sorted(Comparator.comparingDouble(Produto::getPreco).reversed())
                .findFirst();
        return produtoMaiorPreco.get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos.stream()
                .filter(e -> e.getPreco() > precoMinimo)
                .collect(Collectors.toList());
    }
}
