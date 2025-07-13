package provedores;

public class Sedex implements ProvedorFrete {


    public Frete calcularFrete(double peso, double valor) {

        double valorFrete = peso > 1000.0 ? valor * 0.1 : valor * 0.05;
        return new Frete(valorFrete, TipoProvedorFrete.SEDEX);
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}