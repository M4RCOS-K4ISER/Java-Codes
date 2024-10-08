import java.util.Scanner;

public class Calculator_IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o Peso: ");
        Double Peso = scanner.nextDouble();
        System.out.print("Digite a Altura: ");
        Double Altura = scanner.nextDouble();
        scanner.close();
        
        Double IMC = Peso / (Altura * Altura);
        System.out.print("\nIMC: ");
        System.out.print(IMC);

        System.out.print("\nStatus: ");
        if (IMC <= 18.5) {
            System.out.print("Abaixo do Peso");    
        }
        if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.print("Peso Normal");    
        }
        if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.print("Sobrepeso");    
        }
        if (IMC >= 30.0) {
            System.out.print("Obesidade");    
        }
    }
}