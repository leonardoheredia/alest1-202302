package aula13_listasencadeadas;

public class ListaLinearSimplesmenteEncadeada {
    private int quantidade;
    private Nodo inicio;
    private Nodo fim;
    private class Nodo {
        private String item;
        private Nodo proximo;

        private Nodo(String item) {
            this.item = item;
            this.proximo = null;
        }
    }
    public ListaLinearSimplesmenteEncadeada() {
        this.quantidade = 0;
        this.inicio = null;
        this.fim = null;
    }
    /** Insere novo nodo no final da lista   */
    public void adicionar(String item) {

        Nodo novoNodo = new Nodo(item);
        if(this.estaVazia()) {
            this.inicio = novoNodo;
            this.fim = novoNodo;
        }
        else {
            this.fim.proximo = novoNodo;
            this.fim = novoNodo;
        }
        this.quantidade++;
    }
    /** Insere novo nodo em uma posicao especifica da lista   */
    public int buscar(String chave) {
        int posicao = 0;
        for(Nodo n = this.inicio; n!=null; n = n.proximo) {
            if(n.item.equals(chave)) return posicao;
            posicao++;
        }
        return -1; //nao existe
    }
    public void remover(int posicao) {
        if(quantidade==0 || posicao-1>=this.quantidade) return;
        if(posicao<0) return;
        if(posicao==0) { //remover o inicio da lista
            this.inicio = this.inicio.proximo;
        }
        else {
            Nodo nodoAux = this.inicio;
            Nodo anterior = nodoAux;
            for (int i = 0; i < posicao; i++) { //ao sair do laco for o nodoAux sera o nodo a ser removido.
                anterior = nodoAux;
                nodoAux = nodoAux.proximo;
            }
            //removendo nodoAux
            anterior.proximo = nodoAux.proximo;
            if(nodoAux.proximo==null) {
                this.fim = anterior;
            }
        }
        quantidade--;
    }
    public boolean estaVazia() {
        return (this.quantidade==0);
    }

    /*IMPLEMENTAR EM AULA*/
    public String buscar(int posicao) {
        //implementar
        return null;
    }
    public boolean adicionar(int posicao, String item) {
        //implementar metodo que receba um String item e adicionar na posicao recebida
        return true;
    }
    public void remover(String chave) {
        //implementar
    }
    public boolean existe(String chave) {
        //implementar
        return false;
    }
    public void esvaziarLista() {
        //implementar
    }


    @Override
    public String toString() {
        if(this.quantidade==0) return "[]";
        String str = "[";
        for(Nodo n = this.inicio; n!=null; n = n.proximo) {
            str = str + " " + n.item + " ";
        }
        str = str + "] n = " + this.quantidade + " (inicio = " + this.inicio.item + ") (fim = " + this.fim.item + ")";
        return str;
    }


}
