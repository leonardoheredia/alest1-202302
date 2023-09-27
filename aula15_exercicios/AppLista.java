package aula15_exercicios;

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

        int p = lista.buscar("Adilson");
        int p2 = lista.buscar2("Adilson");
        System.out.println(p);
        System.out.println(p2);

        p = lista.buscar("Bruna");
        p2 = lista.buscar2("Bruna");
        System.out.println(p);
        System.out.println(p2);

    }
}
