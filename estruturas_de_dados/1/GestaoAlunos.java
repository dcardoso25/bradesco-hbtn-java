import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {

    private static List<Aluno> alunos = new ArrayList();

    public static void main(String[] args) {

        adicionarAluno("Diego");
        adicionarAluno("Fernanda");
        adicionarAluno("Fabiana");
        System.out.println(listarAlunos());
        buscarAluno("Fernanda");
        excluirAluno("Fernanda");

        excluirAluno("Jones");
        buscarAluno("Diego");

    }

    private static void adicionarAluno(String nome) {
        alunos.add(new Aluno(nome, 23));
    }

    private static List<Aluno> listarAlunos() {
        return alunos;
    }

    private static Aluno buscarAluno(String nome) {
        if(alunos.contains(nome)) {
            return alunos.get(alunos.indexOf(nome));
        }
        return null;
    }

    private static void excluirAluno(String nome) {
        alunos.remove(buscarAluno(nome));
    }

}