package aula03_exercicios_analise_algoritmos;

public class Algoritmos {

    public static void main(String[] args) {

        System.out.println("n;alg_01(n)");
        for (int n = 1; n < 10; n++) {
            System.out.println(n + ";" + alg_01(n));
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

}
