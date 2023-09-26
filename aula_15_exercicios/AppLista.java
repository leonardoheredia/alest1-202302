package aula_15_exercicios;

public class AppLista {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        System.out.println(lista);

        lista.adicionar("Vitoria");
        System.out.println(lista);

        lista.adicionar("Adilson");
        System.out.println(lista);

        lista.adicionar("Guilherme");
        System.out.println(lista);

    }
}
