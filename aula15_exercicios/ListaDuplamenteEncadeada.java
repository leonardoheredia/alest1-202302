package aula15_exercicios;

public class ListaDuplamenteEncadeada {
    private class Nodo {
        String item;
        Nodo proximo;
        Nodo anterior;
        public Nodo(String item) {
            this.item = item;
            proximo = null;
            anterior = null;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    private int quantidade;
    public ListaDuplamenteEncadeada() {
        inicio = new Nodo(null); //eh null pq o conteudo dos nodos inicio e fim sao vazios, nao vamos colocar um noem ali
        fim = new Nodo(null);
        inicio.proximo = fim;
        inicio.anterior = null;
        fim.anterior = inicio;
        fim.proximo = null;
        quantidade = 0;
    }
    public void adicionar(String item) {
        Nodo n = new Nodo(item);
        n.proximo = fim;
        n.anterior = fim.anterior;
        fim.anterior.proximo = n;
        fim.anterior = n;
        quantidade++;
    }
    public int buscar2(String item) {
        Nodo n = inicio.proximo;
        for (int i = 0; i < quantidade; i++) {
            if(n.item.equals(item)) return i;
            n = n.proximo;
        }
        return -1;
    }
    public int buscar(String item) {
        //retorna a posicao do elemento item na lista, iniciando em zero
        //se o item nao existir retorna -1
        Nodo n = inicio.proximo;
        int posicao = 0;
        while(n!=fim) {
            if(n.item.equals(item)) return posicao;
            n = n.proximo;
            posicao++;
        }
        return -1;
    }
    public String buscar(int posicao) {
        //retorna o item armazenado nessa posicao
        //se a posicao nao existir retorna null
        return null;
    }
    public void esvaziarLista() {
        //
    }

    @Override
    public String toString() {
     //  Maria Carla
        String str = "";
        Nodo aux = inicio.proximo;
        while (aux!=fim) {
            str = str + " " + aux.item;
            aux = aux.proximo;
        }
        return str;
    }
}



