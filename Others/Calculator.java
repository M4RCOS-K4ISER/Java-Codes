import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Dois Números Inteiro \n");
        System.out.print("Num 1: ");
        int NumA = scanner.nextInt();
        System.out.print("Num 2: ");
        int NumB = scanner.nextInt();
        System.out.print("Digite a operação (+, -, *, /): ");
        char OP = scanner.next().charAt(0);

        switch (OP) {
            case '+':
                System.out.println("Resultado: " + (NumA + NumB));
                break;
            case '-':
                System.out.println("Resultado: " + (NumA - NumB));
                break;
            case '*':
                System.out.println("Resultado: " + (NumA * NumB));
                break;
            case '/':
                if (NumB != 0) {
                    System.out.println("Resultado: " + (NumA / NumB));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
            System.out.println("Operação inválida");
        }
        scanner.close();
    }
}