package provedores;

public class Loggi implements ProvedorFrete {


    public Frete calcularFrete(double peso, double valor) {

        double valorFrete = peso > 5000.0 ? valor * 0.12 : valor * 0.04;
        return new Frete(valorFrete, TipoProvedorFrete.LOGGI);
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}