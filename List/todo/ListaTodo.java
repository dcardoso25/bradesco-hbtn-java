import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        boolean existe = false;
        for (int i = 0; i < this.tarefas.size(); i++) {
            if (tarefa.getIdentificador() == tarefas.get(i).getIdentificador()) {
                existe = true;
            }
        }
        if (!existe) {
            this.tarefas.add(tarefa);
        } else {
            throw  new IllegalArgumentException("Tarefa com identificador "+ tarefa.getIdentificador() +" ja existente na lista");
        }
    }

    public boolean marcarTarefaFeita(int idenficador) {
        boolean resultado = false;
        for (int i = 0; i < this.tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (idenficador == tarefa.getIdentificador()) {
                tarefa.setEstahFeita(true);
                resultado = true;
            }
        }
        return resultado;
    }

    public boolean desfazerTarefa(int idenficador) {
        boolean resultado = false;
        for (int i = 0; i < this.tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            if (idenficador == tarefa.getIdentificador()) {
                tarefa.setEstahFeita(false);
                resultado = true;
            }
        }
        return resultado;
    }

    public void desfazerTodas() {
        for (int i = 0; i < this.tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (int i = 0; i < this.tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (int i = 0; i < this.tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            String marcador = tarefa.isEstahFeita() ? "X" : " ";
            int identificador = tarefa.getIdentificador();
            String descricao = tarefa.getDescricao();

            System.out.printf("[%s]  Id: %d - Descricao: %s\n", marcador, identificador, descricao);
        }
    }




}