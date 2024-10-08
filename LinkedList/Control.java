package LinkedList;
import java.util.Scanner;

// Classe Principal / Painel de Controle
public class Control {
    public static void main(String[] args) {
        ListaEncadeadaSimples List = new ListaEncadeadaSimples();
        Scanner scanner = new Scanner(System.in);
        int CMD = 0;
        boolean CMD2 = false;

        while (CMD2 == false) {
            System.out.println("\n|Escolha uma opção:");
            System.out.println("|======================================================|");
            System.out.println("|1 - Para Inserir no Início da Lista                   |");
            System.out.println("|2 - Para Inserir no Final da Lista                    |");
            System.out.println("|3 - Para Remover um Elemento                          |");
            System.out.println("|4 - Para Buscar um Elemento                           |");
            System.out.println("|5 - Para Imprimir a List                              |");
            System.out.println("|0 - Sair                                              |");
            System.out.println("|======================================================|");
            System.out.print("|Opção: ");
            CMD = scanner.nextInt();
            scanner.nextLine();

            switch (CMD) {
                //==========================================================================================
                //Adicionar Elemento
                case (1):
                    System.out.print("Digite o Valor Que Deseja Inserido no Início: ");
                    String StartNode = scanner.nextLine();
                    List.InsertEnd(StartNode);
                    break;
                //==========================================================================================
                //Adicionar Elemento no Fianl da Lista
                case (2):
                    System.out.print("Digite o Valor Que Deseja Inserido no Final: ");
                    String EndNode = scanner.nextLine();
                    List.InsertStart(EndNode);
                    break;
                //==========================================================================================
                //Remover Elemento
                case (3):
                    System.out.print("Digite o Valor Que Deseja Remover: ");
                    String Remove = scanner.nextLine();
                    if (List.Remove(Remove)) {
                        System.out.println("Elemento Removido Com Sucesso.");
                    } else {
                        System.out.println("Elemento Não Encontrado.");
                    }
                    break;
                //==========================================================================================
                //Buscar um Elemento
                case (4):
                    System.out.print("Digite o Valor Que Deseja Buscar: ");
                    String Search = scanner.nextLine();
                    if (List.Search(Search)) {
                        System.out.println("Elemento Encontrado na Lista.");
                    } else {
                        System.out.println("Elemento Não Encontrado.");
                    }
                    break;
                //==========================================================================================
                //Imprimir a Lista
                case (5):
                    System.out.println("Elementos da Lista:");
                    List.Print();
                    break;
                //==========================================================================================
                //Finalizar 
                case (0):
                    System.out.println("Encerrando o Programa...");
                    CMD2 = true;
                    break;

                default:
                    System.out.println("Opção Inválida. Tente Novamente.");
            }
        }
        scanner.close();
    }
}
