
public class PersonagemGame {

    private String nome;
    private int saudeAtual;

    public void tomarDano(int quantidadeDeDano) {
        if(saudeAtual > quantidadeDeDano) {
            this.saudeAtual = this.saudeAtual - quantidadeDeDano;
        } else {
            this.saudeAtual = 0;
        }
    }

    public void receberCura(int quantidadeDeCura) {
        int quantidade = this.saudeAtual + quantidadeDeCura;
        this.saudeAtual = quantidade < 100 ? quantidade : 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }
}