public class ArmazemDeEletronico extends Armazem<Eletronico> {

    public void adicionarAoInventario(String nome, Eletronico inventario) {
        super.getInventario().put(nome, inventario);
    }

    public Eletronico obterDoInventario(String nome) {
        return super.getInventario().get(nome);
    }
}
