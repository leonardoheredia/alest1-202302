package aula11_tad_listaslineares;

public class ListaLinearEstatica {
    private static final int CAPACIDADE_INICIAL = 5;
    private int capacidade;
    private int quantidade;
    private String[] itens;
    public ListaLinearEstatica() {
        this.capacidade = CAPACIDADE_INICIAL;
        quantidade = 0;
        itens = new String[capacidade];
    }
    public void adicionar(String item) {
        itens[quantidade] = item;
        quantidade = quantidade + 1;
    }
    public int buscar(String chave) {
        //retorna a posicao da chave na lista
        //caso nao exista retorna -1
        for (int i = 0; i < quantidade; i++) {
            if(chave.equals(itens[i])) return i;
        }
        return -1;
    }
    public void imprimir() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(itens[i]);
        }
    }
    public void limpar() {
        for (int i = 0; i < quantidade; i++) {
            itens[i] = "";
        }
        quantidade = 0;
    }
    public void remover(String chave) {
        int p = buscar(chave);
        if(p<0) return;
        for (int i = p; i < quantidade-1; i++) {
            itens[i] = itens[i+1];
        }
        //quantidade = quantidade - 1;
    }

}
