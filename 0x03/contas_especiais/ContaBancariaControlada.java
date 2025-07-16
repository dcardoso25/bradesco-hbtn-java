import exceptions.OperacaoInvalidaException;

class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) throws OperacaoInvalidaException {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal()  {
        super.aplicarAtualizacaoMensal();
        if (super.getSaldo() < this.saldoMinimo) {
            try {
                super.sacar(this.valorPenalidade);
            } catch (OperacaoInvalidaException e) {
                // Nada a fazer
            }
        }
    }

}
