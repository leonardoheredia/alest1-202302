package aula02_complexidade_algoritmos;

public class ContagemOperacoes {

    public static void main(String[] args) {
        int limite = 200;
        int passo = 1;
        System.out.println("n;funcao_01;funcao_02;funcao_03;funcao_04;funcao_05");
        for (int n = 1; n <= limite; n+=passo) {
            System.out.println(n + ";" + funcao_01(n) + ";" + funcao_02(n) + ";" + funcao_03(n) + ";" + funcao_04(n) + ";" + funcao_05(n));
        }
    }

    public static int funcao_01(int n) {
        int operacoes = 10;
        return operacoes;
    }

    public static int funcao_02(int n) {
        int operacoes = n + 30;
        return operacoes;
    }

    public static int funcao_03(int n) {
        int operacoes = 0;
        for(int i=0; i<n; i++) {
            operacoes++;
        }
        return operacoes;
    }

    public static int funcao_04(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < 2 * i; j++)
                operacoes++;
        return operacoes;
    }

    public static int funcao_05(int n) {
        int operacoes = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < i + 2; j++)
                for (int k = 0; k < n; k++)
                    operacoes++;
        return operacoes;
    }

}
