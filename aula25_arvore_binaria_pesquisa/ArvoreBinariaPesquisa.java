package aula25_arvore_binaria_pesquisa;

public class ArvoreBinariaPesquisa {
    class Nodo {
        public int chave;
        public Nodo esquerda;
        public Nodo direita;
        public Nodo pai;
        public Nodo(int chave) {
            this.chave = chave;
        }
    }
    private Nodo raiz;
    public void adicionar(int chave) {
        Nodo novoNodo = new Nodo(chave);
        if(raiz == null) {
            raiz = novoNodo;
        }
        else {
            adicionarRecursivamente(novoNodo, raiz);
        }
    }
    public void adicionarRecursivamente(Nodo novoNodo, Nodo pai) {
        if(novoNodo.chave < pai.chave) {
            if(pai.esquerda==null) {
                pai.esquerda = novoNodo;
                novoNodo.pai = pai;
            }
            else adicionarRecursivamente(novoNodo, pai.esquerda);
        }
        else {
            if(pai.direita == null) {
                pai.direita = novoNodo;
                novoNodo.pai = pai;
            }
            else adicionarRecursivamente(novoNodo, pai.direita);
        }
    }

    //implementar getTamanho()
    //implementar existe(int chave)
}
