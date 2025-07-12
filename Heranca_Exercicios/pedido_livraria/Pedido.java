public class Pedido {

    private ItemPedido[] itens;
    private double percentualDesconto;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < itens.length; i++) {

            int quantidade = itens[i].getQuantidade();
            double precoLiquido = itens[i].getProduto().obterPrecoLiquido();

            total += precoLiquido * quantidade;
        }
        return total - total * percentualDesconto / 100;
    }
}