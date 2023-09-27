package aula14_filas_pilhas.pilhas_alocacao_estatica;

public class PilhaEstatica {
    private static final int CAPACIDADE_DEFAULT = 5;
    private String[] itens;
    private int capacidade;
    private int quantidade;
    private int topo;
    private int base;

    public PilhaEstatica() {
        this.capacidade = CAPACIDADE_DEFAULT;
        this.itens = new String[this.capacidade];
        this.quantidade = 0;
        this.topo = -1;
        this.base = 0;
    }
    public void empilhar(String item) {
        if(estaLotada()) {
            System.out.println("Pilha lotada. Não há mais espaço.");
            return;
        }
        this.topo++;
        this.itens[topo] = item;
        this.quantidade++;
    }
    public String desempilhar() {
        if(this.estaVazia()) return null;

        String valor = this.itens[this.topo];
        this.itens[this.topo] = null;
        topo--;
        quantidade--;
        return valor;
    }
    public String verTopo() {
        String retorno;
        if(this.estaVazia()) retorno=null;
        else retorno = this.itens[this.topo];
        return retorno;
    }
    public boolean estaVazia() {
        return (quantidade==0);
    }
    public void limpar() {
        this.itens = new String[this.capacidade];
        this.quantidade = 0;
        this.topo = -1;
        this.base = 0;
    }
    public boolean estaLotada() {
        return (this.quantidade==this.capacidade);
    }
    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < this.capacidade; i++) {
            str = str + " " + this.itens[i] + " ";
        }
        str = "PilhaEstatica = {" + str + "}";
        str = str + " base = " + this.base + "   topo = " + this.topo + "  quantidade = " + this.quantidade + "  capacidade = " + this.capacidade;
        return str;
    }

    public static void main(String[] args) {
        PilhaEstatica pilha = new PilhaEstatica();

        System.out.println(pilha);
        pilha.empilhar("Alexandre");
        pilha.empilhar("Leonardo");
        pilha.empilhar("Tales");
        System.out.println(pilha);

        pilha.empilhar("Leandro");
        System.out.println(pilha);

        System.out.println("Desempilhou --> " + pilha.desempilhar());
        System.out.println(pilha);

        pilha.empilhar("Tito");
        System.out.println(pilha);

        pilha.empilhar("Mariana");
        System.out.println(pilha);

        pilha.empilhar("Lucas");
        System.out.println(pilha);



    }
}
