import java.util.Scanner;

public class Animal {
    private String Name;
    private String Specie;
    private int Age;

    // Constructor
    public Animal(String Name, String Specie, int Age) {
        this.Name = Name;
        this.Specie = Specie;
        this.Age = Age;
    }
    // Getters
    public String getName() {
        return Name;
    }
    public String getSpecie() {
        return Specie;
    }
    public int getAge() {
        return Age;
    }
    //Setter
    public void setIdade(int NewAge) {
        this.Age = NewAge;
    }

    //Exibir Infomaçôes
    public void Info() {
        System.out.println("Nome: " + Name);
        System.out.println("Espécie: " + Specie);
        System.out.println("Idade: " + Age + " anos");
    }
    
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Animal MyAnimal = new Animal("Gato", "Felis Catus", 4);

            //Informações Iniciais
            System.out.println("Informações do Animal:");
            MyAnimal.Info();
            //Nova Idade
            System.out.print("\nDigite a Nova Idade do Animal: ");
            int NewAge = scanner.nextInt();
            MyAnimal.setIdade(NewAge);
            //Informações Atualizadas
            System.out.println("\nInformações Atualizadas do Animal:");
            MyAnimal.Info();

            scanner.close();
        }
    }
}