import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner =  new Scanner(System.in);

        while (true) {
            System.out.println("MENU - Gerenciador de Taréfas");
            System.out.println("1 - Adicionar Taréfas");
            System.out.println("2 - Lista de Taréfas");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma das opções!");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite a descrição da taréfa: ");
                    String descricao = scanner.nextLine();
                    taskManager.adicionarTarefa(descricao);
                    break;
                case 2:
                    taskManager.ListaTarefas();
                    break;
                case 3:
                    System.out.println("Fim do Programa");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        }
    }
}