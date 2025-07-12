import produtos.Dvd;

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

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        double totalProdutos = 0;
        for (int i = 0; i < itens.length; i++) {
            String type = "Livro";
            if (itens[i].getProduto() instanceof Dvd) {
                type = "Dvd";
            }
            String title = itens[i].getProduto().getTitulo();
            int quantidade = itens[i].getQuantidade();
            double precoLiquido = itens[i].getProduto().obterPrecoLiquido();
            totalProdutos += precoLiquido * quantidade;

            System.out.printf("Tipo: %s Titulo: %s Preco: %.2f  Quant: %s  Total: %.2f\n",
                    type, title, precoLiquido, quantidade, quantidade * precoLiquido);
        }
        double totalDesconto = totalProdutos * percentualDesconto / 100;
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", totalDesconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalProdutos - totalDesconto);
        System.out.println("----------------------------");

    }
}