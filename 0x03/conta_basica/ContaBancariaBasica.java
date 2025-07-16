import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
        this.numeracao = numeracao;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }
        } else {
            throw new OperacaoInvalidaException("Valor para saque deve ser maior que 0");
        }
    }

    public double calcularTarifaMensal() {
        // banco cobra R$ 10,00 ou 10% do saldo atual da conta, é utilizado aquele que der o valor menor.
        return Math.min(10.0, this.saldo * 0.1);
    }

    public double calcularJurosMensal() {
        // método que calcula o valor em R$ do juros mensal a ser aplicado ao saldo da conta.
        //taxa de juros é 0 quando a conta possui saldo negativo.
        if (this.saldo > 0) {
           return this.saldo * this.taxaJurosAnual /12 / 100;
        } else {
            return this.saldo = 0.0;
        }
    }

    public void aplicarAtualizacaoMensal() {
       // reajusta o saldo da conta subtraindo a tarifa mensal e adicionando o valor de juros mensal.
        double tarifa = this.calcularTarifaMensal();
        double juros = this.calcularJurosMensal();
        this.saldo -= tarifa;
        this.saldo += juros;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
