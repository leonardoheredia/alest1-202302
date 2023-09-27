package aula16_exercicios;

public class PilhaEncadeada {
    class Nodo {
        String item;
        Nodo anterior;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private Nodo topo;
    private int quantidade;
    public PilhaEncadeada() {
        //implementar
    }
    public void empilhar(String item) {
        //IMPLEMENTAR
    }
    public String desempilhar() {
        //IMPLEMENTAR
        return null;
    }
    public void limpar() {
        //IMPLEMENTAR
    }
    public boolean estaVazia() {
        //implementar
        return false;
    }
    @Override
    public String toString() {
        String r = "";
        Nodo aux = topo;
        for (int i = 0; i < quantidade; i++) {
            r  = r + " " + aux.item;
            aux = aux.anterior;
        }
        return r;
    }
}
