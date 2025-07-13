package provedores;

public class JadLog implements ProvedorFrete {


    public Frete calcularFrete(double peso, double valor) {

        double valorFrete = peso > 2000.0 ? valor * 0.07 : valor * 0.045;
        return new Frete(valorFrete, TipoProvedorFrete.JADLOG);
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}