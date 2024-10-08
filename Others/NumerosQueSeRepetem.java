import java.util.Scanner;

public class NumerosQueSeRepetem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];
        
        System.out.println("Digite 10 Números Inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = scanner.nextInt();
        }
        int RV = 0;
        System.out.print("Digite o Número Que Deseja Contar: ");
        int V = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            if (numero[i] == V) {
                RV++;
            }
        }
        if (RV == 1) {
            System.out.println("O Número " + V + " Aparece " + RV + " Vez");
        } else {
            System.out.println("O Número " + V + " Aparece " + RV + " Vezes");
        }
        scanner.close();
    }
}
