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

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(pedido -> pedido.getProdutos().stream()
                        .anyMatch(produto -> produto.getCategoria() == CategoriaProduto.ELETRONICO))
                .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
                .map(p -> {
                    if (p.getCategoria() == CategoriaProduto.ELETRONICO) {
                        p.setPreco(p.getPreco() * 0.85);
                    }
                    return p;
                })
                .collect(Collectors.toList());
    }
}
