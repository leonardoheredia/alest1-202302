package aula14_filas_pilhas.filas_alocacao_dinamica;

public class FilaDinamica {
    private class Nodo {
        public String item;
        public Nodo proximo;
        public Nodo anterior;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private int quantidade;
    private Nodo inicio;
    private Nodo fim;

    public void enfileirar(String item) {
        Nodo novoNodo = new Nodo(item);
        if(estaVazia()) { //primeiro item da fila
            this.inicio = novoNodo;
            this.fim = novoNodo;
        }
        else { //sempre adicionar no final
            this.fim.proximo = novoNodo;
            novoNodo.anterior = this.fim;
            novoNodo.proximo = null;
            this.fim = novoNodo;
        }
        quantidade++;
    }
    public boolean estaVazia() {
        return this.quantidade==0;
    }
    public String desenfileirar() {
        if(estaVazia()) return null;
         String retorno = this.inicio.item;
         this.inicio = this.inicio.proximo;
         if(this.inicio!=null) this.inicio.anterior = null;
         this.quantidade--;
         return retorno;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    @Override
    public String toString() {
        if(estaVazia()) return "{}";
        String str="";
        for (Nodo n=this.inicio; n!=null; n=n.proximo) {
            str = str + " " + n.item + " ";
        }
        str = "FilaDinamica = {" + str + "}";
        str = str + " inicio = " + this.inicio.item + "   fim = " + this.fim.item + "  quantidade = " + this.quantidade;
        return str;
    }
    public static void main(String[] args) {
        FilaDinamica minhaFila = new FilaDinamica();

        minhaFila.enfileirar("Alexandre");
        minhaFila.enfileirar("Leonardo");
        minhaFila.enfileirar("Tales");
        System.out.println(minhaFila);

        minhaFila.enfileirar("Leandro");
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);

        minhaFila.enfileirar("Tito");
        System.out.println(minhaFila);

        minhaFila.enfileirar("Mariana");
        System.out.println(minhaFila);

        minhaFila.enfileirar("Lucas");
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);

        System.out.println("Removendo o " + minhaFila.desenfileirar());
        System.out.println(minhaFila);



    }
}
