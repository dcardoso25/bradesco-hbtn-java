import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private int idade;
    private String cargo;
    private double salario;

    public Pessoa(int codigo, String nome,  String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }

    @Override
    public String toString() {
        return String.format( new Locale("pt", "BR"), "[%d] %s %s %d R$ %.6f", this.codigo, this.nome, this.cargo, this.idade, this.salario);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
