package aula16_exercicios;

public class FilaEncadeada {
    private class Nodo {
        String item;
        Nodo proximo;
        Nodo anterior;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private Nodo primeiro;
    private Nodo ultimo;
    int quantidade;
    public FilaEncadeada() {
        //implementar
    }
    public void enfileirar(String item) {
        //implementar
    }
    public String desenfileirar() {
        String r;
        r = primeiro.item;
        primeiro.proximo.anterior = null;
        primeiro = primeiro.proximo;
        quantidade--;
        return r;
    }
    public boolean estaVazia() {
        //implementar
        return false;
    }
    public void limpar() {
        //IMPLEMENTAR
    }
    @Override
    public String toString() {
        String r = "";
        Nodo aux = primeiro;
        for (int i = 0; i < quantidade; i++) {
            r = r + " " + aux.item;
            aux = aux.proximo;
        }
        return r;
    }
}
