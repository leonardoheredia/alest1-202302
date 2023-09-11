package aula12_listaslinearesestaticas_exercicio;

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

    /*
    * Recebe uma posicao da lista e retornar a chave, caso a posição não existir retornar null
    * */
    public String buscar(int posicao) {
        return null;
    }
    public void imprimir() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(itens[i]);
        }
    }
    public void limpar() {
        //IMPLEMENTAR
    }
    public void remover(String chave) {
        //IMPLEMENTAR
    }
    public void remover(int posicao) {
        //IMPLEMENTAR
    }

    public void mergear(ListaLinearEstatica lista) {
        //IMPLEMENTAR
    }

}

