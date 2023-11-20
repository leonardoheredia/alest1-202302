package aula25_arvore_binaria_pesquisa;

public class NodoArvoreBinariaPesquisa {
    public int chave;
    public NodoArvoreBinariaPesquisa esquerda;
    public NodoArvoreBinariaPesquisa direita;
    public NodoArvoreBinariaPesquisa pai;
    public NodoArvoreBinariaPesquisa(int chave) {
        this.chave = chave;
    }
}