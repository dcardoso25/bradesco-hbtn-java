public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws Exception {
        super(titulo, autor, preco );
    }

    public double getPreco() {
        return super.getPreco() +  super.getPreco() * 0.30;
    }
}
