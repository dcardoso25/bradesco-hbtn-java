package produtos;

public class Livro extends Produto {
    private String titulo;
    private int ano;
    private String pais;
    private double precoBruto;
    private int paginas;
    private String autor;
    private int edicao;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLiquido() {
        return precoBruto * 1.15;
    }


}