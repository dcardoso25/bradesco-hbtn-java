package produtos;

public class Dvd extends Produto {

    private String titulo;
    private int ano;
    private String pais;
    private double precoBruto;
    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido() {
        return super.getPrecoBruto() * 1.2;
    }
}