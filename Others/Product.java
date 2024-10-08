import java.util.Scanner;

public class Product {
    private String Name;
    private int StockValue;

    //Constructor
    public Product(String Name, int StartValue) {
        this.Name = Name;
        if (StartValue >= 0) {
            this.StockValue = StartValue;
        } else {
            this.StockValue = 0;
        }
    }

    //Adicionar Produtos ao Estoque
    public void AddStock(int Value) {
        if (Value > 0) {
            this.StockValue += Value;
            System.out.println(Value + " Unidades Adicionadas ao Estoque.");
        } else {
            System.out.println("A Quantidade Adicionada Deve Ser Positiva.");
        }
    }

    //Remover Produtos do Estoque
    public void RemoveStock(int Value) {
        if (Value > 0) {
            if (this.StockValue >= Value) {
                this.StockValue -= Value;
                System.out.println(Value + " Unidades Removidas do Estoque.");
            } else {
                System.out.println("Quantidade Insuficiente em Estoque.");
            }
        } else {
            System.out.println("A Quantidade Para Remover Deve Ser Positiva.");
        }
    }

    //Informações do Product
    public void Info() {
        System.out.println("Nome do Product: " + this.Name);
        System.out.println("Quantidade em Estoque: " + this.StockValue);
    }

    //Painel de Controle
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o Name do Produto: ");
            String ProductName = scanner.nextLine();
            System.out.print("Digite a Quantidade Inicial em Estoque: ");
            int StartValue = scanner.nextInt();
    
            Product Product = new Product(ProductName, StartValue);
    
            boolean CMD2 = false;
            while (CMD2 == false) {
                System.out.println("\n|Escolha uma opção:");
                System.out.println("|===============================================|");
                System.out.println("|1 - Adicionar Estoque                          |");
                System.out.println("|2 - Remover Estoque                            |");
                System.out.println("|3 - Exibir Informações do Produto              |");
                System.out.println("|4 - Sair                                       |");
                System.out.println("|===============================================|");
                System.out.print("|Opção: ");
                int CMD = scanner.nextInt();

                switch (CMD) {
                    //==========================================================================================
                    //Adicionar ao Estoque
                    case (1):
                        System.out.print("Digite a Quantidade Que Deseja Adicionar: ");
                        int Add = scanner.nextInt();
                        Product.AddStock(Add);
                        break;
                    //==========================================================================================
                    //Remover do Estoque
                    case (2):
                        System.out.print("Digite a Quantidade Que Deseja Remover: ");
                        int Remove = scanner.nextInt();
                        Product.RemoveStock(Remove);
                        break;
                    //==========================================================================================
                    //Exibir Informações
                    case (3):
                        Product.Info();
                        break;
                    //==========================================================================================
                    //Finalizar Programa
                    case (4):
                        System.out.println("Encerrando o Sistema...");
                        CMD2 = true;
                        break;
                    default:
                        System.out.println("Opção Inválida. Tente Novamente.");
                }
            }
            scanner.close();
        }
    }
}


