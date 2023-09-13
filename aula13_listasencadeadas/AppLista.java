package aula13_listasencadeadas;

public class AppLista {
    public static void main(String[] args) {
        casoTeste01();
    }

    public static void casoTeste01() {
        ListaLinearSimplesmenteEncadeada ls = new ListaLinearSimplesmenteEncadeada();
        ls.adicionar("leonardo");
        ls.adicionar("mariana");
        ls.adicionar("tales");
        ls.adicionar("alexandre");

        System.out.println(ls);

        ls.remover(0);
        System.out.println(ls);

        ls.remover("joao");
        System.out.println(ls);
        ls.remover("alexandre");
        System.out.println(ls);

        ls.adicionar(0, "joana");
        System.out.println(ls);

        ls.adicionar(122, "joana");
        System.out.println(ls);

        ls.adicionar(3, "tito");
        System.out.println(ls);

        ls.adicionar(3, "rafaela");
        System.out.println(ls);

        ls.adicionar(4, "lucas");
        System.out.println(ls);

        ls.adicionar(6, "ketelin");
        System.out.println(ls);

        ls.remover("joana");
        System.out.println(ls);

        ls.esvaziarLista();
        System.out.println(ls);
    }
}
