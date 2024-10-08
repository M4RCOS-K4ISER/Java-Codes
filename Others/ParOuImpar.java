import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o Valor: ");
        Double Num = scanner.nextDouble();

        if (Num % 2 == 0) {
            System.out.print("O Valor é Par");    
        } else {
            System.out.print("O Valor é Impar");
        }
        scanner.close();
    }
}