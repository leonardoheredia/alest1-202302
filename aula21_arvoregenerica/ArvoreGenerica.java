package aula21_arvoregenerica;

public class ArvoreGenerica {
    class Nodo {
        public Nodo pai;
        public String item;
        public Nodo[] filhos;
        public int quantidadeFilhos;
        public Nodo(String item) {
            this.item = item;
            filhos = new Nodo[5];
            quantidadeFilhos = 0;
            pai = null;
        }
        public void adicionarFilho(Nodo f) {
            filhos[quantidadeFilhos] = f;
            f.pai = this;
            quantidadeFilhos++;
        }
    }
    private Nodo raiz;
    private int tamanho;
    public int getTamanho() {
        return tamanho;
    }

    public ArvoreGenerica(String item) {
        Nodo n = new Nodo(item);
        raiz = n;
        tamanho++;
    }
    public void adicionarNodo(String item, String pai) {
        Nodo nodoPai = pesquisarNodo(pai, raiz);
        if(nodoPai!=null) {
            Nodo nodoFilho = new Nodo(item);
            nodoPai.adicionarFilho(nodoFilho);
            tamanho++;
        }
        else {
            System.out.println("NAO FOI POSSIVEL INSERIR");
        }
    }
    public boolean existe(String item) {
        return pesquisarNodo(item, raiz)!=null;
    }
    public void percorrer() {
        System.out.println("");
        percorrerRecursivo(raiz);
    }
    private void percorrerRecursivo(Nodo n) {
        if(n!=null) {
            if(n.quantidadeFilhos>0) {
                for (int i = 0; i < n.quantidadeFilhos; i++) {
                    percorrerRecursivo(n.filhos[i]);
                };
            }
            System.out.printf(n.item + " ");
        }
    }
    private Nodo pesquisarNodo(String item, Nodo n) {
        if(n.item.equals(item)) return n;
        else if(n.quantidadeFilhos>0) {
            for (int i = 0; i < n.quantidadeFilhos; i++) {
                Nodo r = pesquisarNodo(item, n.filhos[i]);
                if(r!=null) return r;
            }
        }
        return null;
    }







}
