package aula07_algoritmos_ordenacao;

public class QuickSort {
    private static int operacoes = 0;
    private long tempoInicio;
    private long tempoFim;
    public long getTempoExecucao() {
        long tempoExecucao = (tempoFim - tempoInicio) / 1_000  ;
        return tempoExecucao;
    }
    public void ordenar(int[] arr) {
        tempoInicio = System.nanoTime();
        operacoes = 0;

        ordenar(arr, 0, arr.length - 1);

        tempoFim = System.nanoTime();
    }
    private static void ordenar(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(arr, inicio, fim);
            ordenar(arr, inicio, indicePivo - 1);
            ordenar(arr, indicePivo + 1, fim);
        }
    }
    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            operacoes++;
            if (arr[j] < pivo) {
                i++;
                trocar(arr, i, j);
            }
        }

        trocar(arr, i + 1, fim);
        return i + 1;
    }
    private static void trocar(int[] arr, int i, int j) {
        operacoes++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int getOperacoes(){
        return operacoes;
    }
}
