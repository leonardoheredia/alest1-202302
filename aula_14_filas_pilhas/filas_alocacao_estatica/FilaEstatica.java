package aula_14_filas_pilhas.filas_alocacao_estatica;

public class FilaEstatica {

    private static final int CAPACIDADE_INICIAL = 6;
    private String[] itens;
    private int capacidade;
    private int quantidade;
    private int inicio;
    private int fim;

    public FilaEstatica() {
        this.capacidade = CAPACIDADE_INICIAL;
        this.itens = new String[this.capacidade];

        this.quantidade = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public void enfileirar(String item) {
        int posicao = this.fim+1;
        this.itens[posicao] = item;
        this.fim = posicao;
        this.quantidade++;
    }

    public String desenfileirar() {
        String retorno = itens[this.inicio];
        itens[this.inicio] = null;
        this.inicio++;
        this.quantidade--;
        return retorno;
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

    public static void main(String[] args) {
        FilaEstatica minhaFila = new FilaEstatica();
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

        minhaFila.enfileirar("Lucas");
        System.out.println(minhaFila);

    }
}
