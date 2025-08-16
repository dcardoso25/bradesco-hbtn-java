import java.lang.IllegalArgumentException;
public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        this.identificador = identificador;
        modificarDescricao(descricao);
    }

    private void modificarDescricao(String descricao) throws IllegalArgumentException {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        } else {
           this.descricao = descricao;
        }
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }
}