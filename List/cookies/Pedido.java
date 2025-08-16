import java.util.ArrayList;
import java.util.List;

public class Pedido {

    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookie) {
        this.cookies.add(cookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie: cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String nomeSabor) {
        int removido = 0;
        for (int i = 0; i < cookies.size(); i++) {
            PedidoCookie cookie = cookies.get(i);
            if (nomeSabor.equals(cookie.getSabor())) {
                cookies.remove(i);
                removido += cookie.getQuantidadeCaixas();
            }
        }
        return removido;
    }

}