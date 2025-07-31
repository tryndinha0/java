package Collections.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = t;
                    break;
                }
            }
        } else {
            System.out.println("conjunto vazio");
        }
        tarefasSet.remove(tarefaRemover);
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Tarefa nao encontrada");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConlcuidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConlcuidas.add(t);
            }
        }
        return tarefasConlcuidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaMarcarPendente = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaMarcarPendente = t;
                break;
            }
        }
        if (tarefaMarcarPendente != null) {
            if (tarefaMarcarPendente.isConcluida()) {
                tarefaMarcarPendente.setConcluida(false);
            } else {
                System.out.println("Tarefa já está pendente");
            }
        } else {
            System.out.println("Tarefa nao encontrada");
        }

    }

    public void limparListaTarefas() {
        if (tarefasSet.isEmpty()) {
            System.out.println("conjunto ja está vazio");
        } else {
            tarefasSet.clear();
        }
    }

    

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaPendente("Estudar Java");

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}