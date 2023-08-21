package aula03_exercicios_analise_algoritmos;

public class ExerciciosAula03 {

    public static void main(String[] args) {
        System.out.println("n;alg_08");
        for (int n = 1; n <= 43; n++) {
            System.out.println(n + ";" + alg_08(n));
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
    public static int alg_02(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                operacoes++;
        return operacoes;
    }
    public static int alg_03(int n) {
        int operacoes = 100;
        return operacoes;
    }
    public static int alg_04(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < i + 2; j++)
                for (int k = 0; k < n; k++)
                    operacoes++;
        return operacoes;
    }
    public static int alg_05(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < 2 * i; j++)
                operacoes++;
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
    public static int alg_07(int n) {
        int operacoes = 0;
        int aux = n;
        do {
            aux = aux / 2;
            operacoes++;
        }while(aux>1);
        return operacoes;
    }
    public static int alg_08(int n) {
        int[] operacoes = new int[1];
        operacoes[0] = 0;
        fibonacci(n, operacoes);
        return operacoes[0];
    }
    public static int fibonacci(int n, int[] operacoes) {
        operacoes[0]++;
        if(n<=1) return 1;
        return fibonacci(n-1, operacoes) + fibonacci(n -2, operacoes);
    }
}
