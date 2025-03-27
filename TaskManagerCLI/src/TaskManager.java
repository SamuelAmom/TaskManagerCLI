import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task>tarefas;
    private int contadorId = 1;

    public TaskManager(){
        this.tarefas = new ArrayList<>();
    }

    //Metodo para add uma nova tarefa
    public void adicionarTarefa(String descricao){
        Task novaTarefa = new Task(contadorId++, descricao);
        tarefas.add(novaTarefa);
        System.out.println("Tarefá adicionada com sucesso: " + descricao);
    }

    //Metodo para listar todas as tarefas
    public  void ListaTarefas (){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma taréfa encontrada.");
            return;
        } else {
          System.out.println("Lista de taréfas: ");
          for (Task t : tarefas){
              System.out.println(t.getId() + " - " + t);
          }
        }
    }
}
