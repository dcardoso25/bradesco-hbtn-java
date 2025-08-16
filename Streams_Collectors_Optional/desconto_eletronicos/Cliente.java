public class Cliente {
    private int codigo;
    private String nome;
    private boolean premium;

    public Cliente(int codigo, String nome, boolean premium) {
        this.codigo = codigo;
        this.nome = nome;
        this.premium = premium;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean isPremium() {
        return premium;
    }
}
