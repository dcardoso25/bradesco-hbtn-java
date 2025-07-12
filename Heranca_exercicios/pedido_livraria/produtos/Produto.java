package produtos;

public abstract class Produto {
    private String titulo;
    private int ano;
    private String pais;
    private double precoBruto;

    public abstract double obterPrecoLiquido();
}