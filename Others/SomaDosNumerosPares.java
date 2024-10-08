public class SomaDosNumerosPares {
    public static void main(String[] args) {
        int Resultado = 0;

        for(int I = 1; I <= 100; I++) {
            if (I % 2 == 0) {
             Resultado += I;   
            }
        }
        System.out.print("O Resultado da Some é: " + Resultado);
    }
}