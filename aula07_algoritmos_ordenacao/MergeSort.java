package aula07_algoritmos_ordenacao;

public class MergeSort {
    private int[] numbers;
    private int[] helper;
    private int number;
    private int operacoes;
    private long tempoInicio;
    private long tempoFim;
    public long getTempoExecucao() {
        long tempoExecucao = (tempoFim - tempoInicio) / 1_000  ;
        return tempoExecucao;
    }

    public int getOperacoes() {
        return operacoes;
    }
    public void ordenar(int[] values) {
        tempoInicio = System.nanoTime();

        operacoes = 0;
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);

        tempoFim = System.nanoTime();

    }
    private void mergesort(int low, int high) {
        // Check if low is smaller then high, if not then the array is sorted
        operacoes++;
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = (low + high) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }
    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
            operacoes++;
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            operacoes++;
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
            operacoes++;
        }
    }
}
