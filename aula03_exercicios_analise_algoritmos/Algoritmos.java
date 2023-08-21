package aula03_exercicios_analise_algoritmos;

public class Algoritmos {

    public static void main(String[] args) {

        System.out.println("n;alg_01(n);alg_06(n)");
        for (int n = 1; n < 10_000; n+=2) {
            System.out.println(n + ";" + alg_01(n)
            + ";" + alg_06(n));
        }

    }
    public static int alg_01(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++) {
            operacoes++;
        }
        operacoes = 3*operacoes+3;
        return operacoes;
    }

    public static long alg_06(int n) {
        long operacoes = 1;
        for (int i = 1; i <= n / 2; i++) {
            operacoes = operacoes * n;
            if (operacoes >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;

            }
        }
        return operacoes;
    }

}
