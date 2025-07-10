public class PersonagemGame {

    private String status;
    private String nome;
    private int saudeAtual;

    public PersonagemGame(int saudeAtual, String nome) {
        this.nome = nome;
        this.saudeAtual = saudeAtual;
        definirStatus();
    }

    private void definirStatus() {
       this.status = this.saudeAtual <= 0 ? "morto" : "vivo";
    }

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


    public String getStatus() {
        return saudeAtual <= 0 ? "morto" : "vivo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.equals("")) {
            this.nome = nome;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }
}