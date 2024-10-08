import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um Valor Positivo: ");
        Double Num = scanner.nextDouble();
        
        if (Num % 2 == 0 || Num % 3 == 0 || Num % 5 == 0 ) {
            System.out.print("O Valor Não é Primo");
        } else {
            System.out.print("O Valor é Primo");
        } 
        scanner.close();
    }
}