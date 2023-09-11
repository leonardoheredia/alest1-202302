package aula12_listaslinearesestaticas_exercicio;

public class AppUsandoListaEstatica {
    public static void main(String[] args) {
        ListaLinearEstatica lista = new ListaLinearEstatica();

        System.out.println("");
        lista.adicionar("Tales");
        lista.adicionar("Mariana");
        lista.adicionar("Alexandre");
        lista.imprimir();

        System.out.println("");
        lista.remover("Tales");
        lista.imprimir();

    }
}
