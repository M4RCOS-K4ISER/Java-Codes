import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Num = new int[10];
        int Greater = Num[0];
        int Lowest = Num[0];

        System.out.println("Digite 10 Números Inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            Num[i] = scanner.nextInt();
        }

        for (int i = 1; i < 10; i++) {
            if (Num[i] > Greater) {
                Greater = Num[i];
            }
            if (Num[i] < Lowest) {
                Lowest = Num[i];
            }
        }

        System.out.println("\n");
        System.out.println("Maior Valor: " + Greater);
        System.out.println("Menor Valor: " + Lowest);
        scanner.close();
    }
}
