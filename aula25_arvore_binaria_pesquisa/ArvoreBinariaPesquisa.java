package aula25_arvore_binaria_pesquisa;

import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBinariaPesquisa {
    private NodoArvoreBinariaPesquisa raiz;
    private int tamanho;
    private String caminhoPreOrdem;
    private String caminhoPosOrdem;
    private String caminhoLargura;
    public void adicionar(int chave) {
        NodoArvoreBinariaPesquisa novoNodo = new NodoArvoreBinariaPesquisa(chave);
        if(raiz == null) {
            raiz = novoNodo;
        }
        else {
            adicionarRecursivamente(novoNodo, raiz);
        }
        tamanho++;
    }
    private void adicionarRecursivamente(NodoArvoreBinariaPesquisa novoNodo, NodoArvoreBinariaPesquisa pai) {
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
    public int getTamanho() {
        return tamanho;
    }
    public boolean existe(int chave) {
        NodoArvoreBinariaPesquisa aux = this.raiz;
        return consultaChaveRecursivamente(chave, aux)!=null;
    }
    private NodoArvoreBinariaPesquisa consultaChaveRecursivamente(int chave, NodoArvoreBinariaPesquisa nodo) {
        if(nodo==null) return null;

        if(chave == nodo.chave) return nodo;

        if(chave < nodo.chave) return consultaChaveRecursivamente(chave, nodo.esquerda);
        else return consultaChaveRecursivamente(chave, nodo.direita);
    }
    public int obterPai(int chave) {
        NodoArvoreBinariaPesquisa n = consultaChaveRecursivamente(chave, raiz);
        if(n!=null) return n.pai.chave;
        else return -1;
    }
    public int obterDireita(int chave) {
        NodoArvoreBinariaPesquisa n = consultaChaveRecursivamente(chave, raiz);
        if(n!=null) return n.direita.chave;
        else return -1;
    }
    public int obterEsquerda(int chave) {
        NodoArvoreBinariaPesquisa n = consultaChaveRecursivamente(chave, raiz);
        if(n!=null) return n.esquerda.chave;
        else return -1;
    }
    private void percorrerEmProfundidade() {
        caminhoPreOrdem = "";
        caminhoPosOrdem = "";
        caminhoLargura = "";
        percorrerEmProfundidadeRecursivamente(raiz);
    }
    private void percorrerEmProfundidadeRecursivamente(NodoArvoreBinariaPesquisa nodo) {
        caminhoPreOrdem = caminhoPreOrdem + " " + nodo.chave;
        if(nodo.esquerda!=null) percorrerEmProfundidadeRecursivamente(nodo.esquerda);
        if(nodo.direita!=null) percorrerEmProfundidadeRecursivamente(nodo.direita);
        caminhoPosOrdem = caminhoPosOrdem + " " + nodo.chave;
    }
    public String getCaminhoPreOrdem() {
        percorrerEmProfundidade();
        return caminhoPreOrdem;
    }
    public String getCaminhoPosOrdem() {
        percorrerEmProfundidade();
        return caminhoPosOrdem;
    }
    public String getCaminhoLargura() {
        percorrerEmLargura();
        return caminhoLargura;
    }
    private void percorrerEmLargura() {
        caminhoLargura = "";
        Queue<NodoArvoreBinariaPesquisa> fila = new LinkedList<>();
        fila.add(raiz);
        while(!fila.isEmpty()) {
            NodoArvoreBinariaPesquisa n = fila.poll();
            if(n.esquerda!=null) fila.add(n.esquerda);
            if(n.direita!=null) fila.add(n.direita);
            caminhoLargura = caminhoLargura + " " + n.chave;
        }
    }
    public void imprimirArvore() {
        imprimirArvoreRecusivamente(this.raiz, 0);
    }
    private void imprimirArvoreRecusivamente(NodoArvoreBinariaPesquisa raiz, int nivel) {
        if (raiz == null) return;
        nivel += 5;
        imprimirArvoreRecusivamente(raiz.direita, nivel);
        System.out.print("\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        System.out.print(raiz.chave + "\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        imprimirArvoreRecusivamente(raiz.esquerda, nivel);
    }
    private boolean ehInterno(NodoArvoreBinariaPesquisa nodo) {
        return filhos(nodo)>0;
    }
    private boolean ehExterno(NodoArvoreBinariaPesquisa nodo) {
        return filhos(nodo)==0;
    }
    private int filhos(NodoArvoreBinariaPesquisa nodo) {
        int q = 0;
        if (nodo.esquerda!=null) q++;
        if(nodo.direita!=null) q++;
        return q;
    }
    private NodoArvoreBinariaPesquisa menorNodo(NodoArvoreBinariaPesquisa nodo) {
        NodoArvoreBinariaPesquisa n = nodo;
        while (n.esquerda!=null) {
            n = n.esquerda;
        }
        return n;
    }
    private boolean removerFolha(NodoArvoreBinariaPesquisa folha) {

        if(filhos(folha)>0) return false;

        NodoArvoreBinariaPesquisa pai = folha.pai;
        if(folha.equals(pai.esquerda)) pai.esquerda = null;
        else if(folha.equals(pai.direita)) pai.direita = null;

        if(folha==raiz) raiz = null;

        return true;
    }
    public boolean remover(int chave) {
        NodoArvoreBinariaPesquisa nodoParaExcluir = consultaChaveRecursivamente(chave, raiz);
        return remover(nodoParaExcluir);
    }
    public boolean remover(NodoArvoreBinariaPesquisa nodoParaExcluir) {
        //retorna true se conseguiu excluir ou false se deu algum problema
        if(nodoParaExcluir==null) return false;

        NodoArvoreBinariaPesquisa pai = nodoParaExcluir.pai;
        if(filhos(nodoParaExcluir)==0) { //nodo para excluir eh nodo FOLHA
            removerFolha(nodoParaExcluir);
        }
        else if (nodoParaExcluir.esquerda!=null && nodoParaExcluir.direita==null ) { //Nodo para excluir tem apenas UM filho A ESQUERDA. Colocar o nodo filho em seu lugar e remover o nodo.
            if(nodoParaExcluir==raiz) raiz = nodoParaExcluir.esquerda;
            else {
                if(nodoParaExcluir.equals(pai.esquerda)) pai.esquerda = nodoParaExcluir.esquerda;
                else if(nodoParaExcluir.equals(pai.direita)) pai.direita = nodoParaExcluir.esquerda;
                nodoParaExcluir.esquerda.pai = pai;
            }
        }
        else if(nodoParaExcluir.direita!=null && nodoParaExcluir.esquerda==null) { //Nodo para excluir tem apenas UM filho A DIREIRA. Colocar o nodo filho em seu lugar e remover o nodo.
            if(nodoParaExcluir==raiz) raiz = nodoParaExcluir.direita;
            else {
                if(nodoParaExcluir.equals(pai.esquerda)) pai.esquerda = nodoParaExcluir.direita;
                else if(nodoParaExcluir.equals(pai.direita)) pai.direita = nodoParaExcluir.direita;
                nodoParaExcluir.direita.pai = pai;
            }
        }
        else { //tem dois filhos, entao pega o MENOR a DIREITA e substitui pelo nodo a ser excluido, chamando a funcao novamente
            NodoArvoreBinariaPesquisa menor = menorNodo(nodoParaExcluir.direita);
            //substitui o nodo a ser excluido pelo menor e dispara novamente o metodo
            //nesse caso o unico elemento do nodo eh a chave (um inteiro), caso o elemento for um objeto isso deve ser tratado de acordo
            int temp = nodoParaExcluir.chave;
            nodoParaExcluir.chave = menor.chave;
            menor.chave = temp;
            remover(menor);
        }
        return true;
    }
    public String toDot() {
        return toDot(" ");
    }
    public String toDot(String separador) {
        String s = separador + "digraph ABP { ";
        Queue<NodoArvoreBinariaPesquisa> fila = new LinkedList<>();
        fila.add(raiz);
        while (!fila.isEmpty()) {
            NodoArvoreBinariaPesquisa n = fila.poll();
            if(n.esquerda!=null) {
                s = s + separador + n.chave + " -> " + n.esquerda.chave;
                fila.add(n.esquerda);
            }
            if(n.direita!=null) {
                s = s + separador + n.chave + " -> " + n.direita.chave;
                fila.add(n.direita);
            }
        }
        s = s + separador + "}";
        return s;
    }
}
