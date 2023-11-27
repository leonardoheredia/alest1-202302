package T3_classe_AVL_completa;

public class ArvoreAVL {
    private NodoAVL raiz;
    private int tamanho;
    private String caminhoPreOrdem;
    private String caminhoPosOrdem;
    private String caminhoLargura;

    private int maximo(int a, int b) {
        if(a>b) return a;
        else return b;
    }
    private int obterAltura(NodoAVL n) {
        if(n==null) return -1;
        else return n.altura;
    }
    private int calcularFatorBalanceamento(NodoAVL n) {
        if(n==null) return 0;
        else return obterAltura(n.esquerda) - obterAltura(n.direita);
    }
    public void adicionar(int chave) {
        raiz = adicionar(chave, raiz);
        tamanho++;
    }
    private NodoAVL adicionar(int chave, NodoAVL n) {
        if(n==null) {
            n = new NodoAVL(chave);
        }
        else if (chave < n.chave) {
            n.esquerda = adicionar(chave, n.esquerda);
        }
        else if (chave > n.chave) {
            n.direita = adicionar(chave, n.direita);
        }

        n = balancear(n, chave);
        return n;
    }
    private NodoAVL balancear(NodoAVL n, int chave) {
        int fatorBalanceamento = calcularFatorBalanceamento(n);

        //atualiza a altura somando 1 recursivamente ate a raiz, folha altura = 0
        n.altura = maximo(obterAltura(n.esquerda), obterAltura(n.direita)) + 1;

        if (fatorBalanceamento > 1 && chave < n.esquerda.chave) {
            System.out.println("Rotacao simples a direita");
            return rotacaoSimplesDireita(n);
        }

        if (fatorBalanceamento < -1 && chave > n.direita.chave) {
            System.out.println("Rotacao simples a esquera");
            return rotacaoSimplesEsquerda(n);
        }

        if (fatorBalanceamento > 1 && chave > n.esquerda.chave) {
            System.out.println("Rotacao Esquerda Direita");
            return rotacaoEsquerdaDireita(n);
        }

        if (fatorBalanceamento < -1 && chave < n.direita.chave) {
            System.out.println("Rotacao Direita Esquerda");
            return rotacaoDireitaEsquerda(n);
        }
        return n;
    }

    private NodoAVL rotacaoSimplesDireita(NodoAVL B) {
        NodoAVL A = B.esquerda;
        B.esquerda = A.direita;
        A.direita = B;
        B.altura = maximo(obterAltura(B.esquerda), obterAltura(B.direita)) + 1;
        A.altura = maximo(obterAltura(A.esquerda), obterAltura(A.direita)) + 1;
        return A;
    }

    private NodoAVL rotacaoSimplesEsquerda(NodoAVL B) {
        NodoAVL A = B.direita;
        B.direita = A.esquerda;
        A.esquerda = B.esquerda;
        B.altura = maximo(obterAltura(B.esquerda), obterAltura(B.direita)) + 1;
        A.altura = maximo(obterAltura(A.esquerda), obterAltura(A.direita)) + 1;
        return A;
    }
    private NodoAVL rotacaoEsquerdaDireita(NodoAVL n) {
        System.out.println("Rotacao a esquerda no nodo " + n.esquerda.chave);
        System.out.println("Rotacao a direita no nodo " + n.chave);
        n.esquerda = rotacaoSimplesEsquerda(n.direita);
        return  rotacaoSimplesDireita(n);
    }

    private NodoAVL rotacaoDireitaEsquerda(NodoAVL n) {
        System.out.println("Rotacao a direita no nodo " + n.direita.chave);
        System.out.println("Rotacao a esquerda no nodo " + n.chave);
        n.direita = rotacaoSimplesDireita(n.esquerda);
        return  rotacaoSimplesEsquerda(n);
    }

    public void imprimirArvore() {
        imprimirArvoreRecusivamente(this.raiz, 0);
    }
    private void imprimirArvoreRecusivamente(NodoAVL raiz, int nivel) {
        if (raiz == null) return;
        nivel += 5;
        imprimirArvoreRecusivamente(raiz.direita, nivel);
        System.out.print("\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        System.out.print(raiz.chave + "\n");
        for (int i = 5; i < nivel; i++) System.out.print(" ");
        imprimirArvoreRecusivamente(raiz.esquerda, nivel);
    }

    public void percorrerEmPreOrdem() {
        percorrerEmPreOrdemRecursivo(raiz);
        System.out.println();
    }
    private void percorrerEmPreOrdemRecursivo(NodoAVL n) {
        if(n == null) return;
        System.out.printf(" " + n.chave);
        percorrerEmPreOrdemRecursivo(n.esquerda);
        percorrerEmPreOrdemRecursivo(n.direita);
    }


}
