package aula14_filas_pilhas.filas_alocacao_estatica;

public class FilaEstaticaComDuplicacao {

    private static final int CAPACIDADE_INICIAL = 6;
    private String[] itens;
    private int capacidade;
    private int quantidade;
    private int inicio;
    private int fim;

    public FilaEstaticaComDuplicacao() {
        this.capacidade = CAPACIDADE_INICIAL;
        this.itens = new String[this.capacidade];

        this.quantidade = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    private void duplicar() {
        int novaCapacidade = this.capacidade * 2;
        String[] itensAux = new String[novaCapacidade];
        for (int i = 0; i < this.capacidade; i++) {
            itensAux[i] = this.itens[i];
        }
        this.capacidade = novaCapacidade;
        this.itens = itensAux;
    }
    public void enfileirar(String item) {
        if(this.fim+1 == capacidade) {
            System.out.println("Duplicando o array");
            duplicar();
        }
        int posicao = this.fim+1;
        this.itens[posicao] = item;
        this.fim = posicao;
        this.quantidade++;
    }

    public String desenfileirar() {
        if(this.estaVazia()) {
            System.out.println("Sinto muito, a fila está vazia");
            return null;
        }
        String retorno = itens[this.inicio];
        itens[this.inicio] = null;
        this.inicio++;
        this.quantidade--;
        if(this.estaVazia()) {
            this.limpar();
        }
        return retorno;
    }

    public void limpar() {
        for (int i = 0; i < this.capacidade; i++) {
            itens[i] = null;
        }
        this.quantidade = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < this.capacidade; i++) {
            str = str + " " + this.itens[i] + " ";
        }
        str = "FilaEstatica = {" + str + "}";
        str = str + " inicio = " + this.inicio + "   fim = " + this.fim + "  quantidade = " + this.quantidade + "  capacidade = " + this.capacidade;
        return str;
    }

    public boolean estaVazia() {
        return this.quantidade==0;
    }


    public static void main(String[] args) {
        FilaEstaticaComDuplicacao minhaFila = new FilaEstaticaComDuplicacao();
        System.out.println(minhaFila);

        minhaFila.enfileirar("Alexandre");
        minhaFila.enfileirar("Leonardo");
        minhaFila.enfileirar("Tales");
        System.out.println(minhaFila);

        minhaFila.enfileirar("Leandro");
        System.out.println(minhaFila);

        minhaFila.desenfileirar();
        System.out.println(minhaFila);

        minhaFila.enfileirar("Tito");
        System.out.println(minhaFila);

        minhaFila.enfileirar("Mariana");
        System.out.println(minhaFila);

        minhaFila.desenfileirar();
        System.out.println(minhaFila);

        minhaFila.enfileirar("Lucas");
        System.out.println(minhaFila);

        minhaFila.enfileirar("Lucas2");
        System.out.println(minhaFila);

        minhaFila.desenfileirar();
        minhaFila.desenfileirar();
        minhaFila.desenfileirar();
        minhaFila.desenfileirar();
        minhaFila.desenfileirar();
        minhaFila.desenfileirar();
        minhaFila.desenfileirar();
        System.out.println(minhaFila);

        minhaFila.enfileirar("Lucas2");
        System.out.println(minhaFila);

        minhaFila.desenfileirar();
        System.out.println(minhaFila);
    }
}
