
import java.util.ArrayList;

public class ListaDeTarefas {

    // estudar mais para prova, mexer com lista buga minha cabecita, nao consigo fazer sozinho 
    private ArrayList<Tarefa> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String titulo) {
        tarefas.add(new Tarefa(titulo));
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("nao achou tarefa");
        }
    }

    public void marcarTarefaComoConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
        } else {
            System.out.println("nao achou tarefa");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("lista vazia.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }
}
    




