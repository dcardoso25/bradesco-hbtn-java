import java.util.Map;
import java.util.HashMap;

public abstract class Armazem <T> implements Armazenavel<T> {

    private Map<String, T> inventario = new HashMap<String, T>();

    public Map<String, T> getInventario() {
        return inventario;
    }

    public void setInventario(Map<String, T> inventario) {
        this.inventario = inventario;
    }

    public void adicionarAoInventario(String nome, T inventario) {
        this.inventario.put(nome, inventario);
    }

    public T obterDoInventario(String nome) {
        return inventario.get(nome);
    }

}
