package aula07_algoritmos_ordenacao;
public class InsertionSort {
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
    public void ordenar(int[] arrayInteiros) {
        operacoes = 0;
        tempoInicio = System.nanoTime();

        int tamanho = arrayInteiros.length;
        int chave;
        for (int j = 1; j < tamanho; j++) { //inicia no elemento 1
            chave = arrayInteiros[j];
            //System.out.printf("chave = %d%n", chave);
            int i = j - 1;
            while ( (i>=0) && (arrayInteiros[i] > chave) ) {
                //System.out.printf("Trocou %d pelo %d%n", arrayInteiros[i+1], arrayInteiros[i]);
                arrayInteiros[i+1] = arrayInteiros[i];
                i = i -1;
                operacoes++;
            }
            operacoes++;
            arrayInteiros[i+1] = chave;
        }

        tempoFim = System.nanoTime();
    }
}
