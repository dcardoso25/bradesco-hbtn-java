public class ArmazemDeComida extends Armazem<Comida> {

    public void adicionarAoInventario(String nome, Comida inventario) {
        super.getInventario().put(nome, inventario);
    }

    public Comida obterDoInventario(String nome) {
        return super.getInventario().get(nome);
    }

}
