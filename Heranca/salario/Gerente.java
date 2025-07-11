
public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double valorAtingido = departamento.getValorAtingidoMeta();
        double valorMeta = departamento.getValorMeta();
        double diferenca = valorAtingido - valorMeta;
        if (valorAtingido >= valorMeta) {
            return super.getSalarioFixo() * 0.2 + diferenca * 0.01;
        }
        return 0;
    }
}