public interface Armazenavel <T> {
    public void adicionarAoInventario(String nome, T inventario);
    public T obterDoInventario(String nome);
}
