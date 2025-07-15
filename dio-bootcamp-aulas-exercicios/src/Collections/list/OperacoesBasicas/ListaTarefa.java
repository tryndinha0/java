package Collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int totalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.totalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefa.totalTarefas());
        listaTarefa.obterDescricoesTarefas(); 

    }
}
