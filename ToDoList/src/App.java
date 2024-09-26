import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
         Scanner scanner = new Scanner(System.in);
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        while (true) {
            System.out.println("\nto-do-list:");
            listaDeTarefas.listarTarefas();
            System.out.println("\nopcao:");
            System.out.println("1. add tarefa");
            System.out.println("2. remover tarefa");
            System.out.println("3. concluir tarefa");
            System.out.println("4. sair");

            System.out.print("escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); //tem que usar isso para nao limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("nome da tarefa: ");
                    String titulo = scanner.nextLine();
                    listaDeTarefas.adicionarTarefa(titulo);
                    break;
                case 2:
                    System.out.print("quanstas tarefas quer remover: ");
                    int indiceRemover = scanner.nextInt() - 1;
                    listaDeTarefas.removerTarefa(indiceRemover);
                    break;
                case 3:
                    System.out.print("qual o numero da tarefa que concluiu: ");
                    int indiceConcluir = scanner.nextInt() - 1;
                    listaDeTarefas.marcarTarefaComoConcluida(indiceConcluir);
                    break;
                case 4:
                    System.out.println("tchauuu obrigadu");
                    scanner.close();
                    return;
                default:
                    System.out.println("tente de novo e tente certo agora");
            }
        }
    }



}
