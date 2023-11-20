package aula25_arvore_binaria_pesquisa;

public class AppArvoreBinariaPesquisa {
    public static void main(String[] args) {
        ArvoreBinariaPesquisa abp = new ArvoreBinariaPesquisa();
        abp.adicionar(60);
        abp.adicionar(32);
        abp.adicionar(15);
        abp.adicionar(70);
        abp.adicionar(40);
        abp.adicionar(90);
        abp.adicionar(65);
        abp.adicionar(99);
        abp.adicionar(85);
        abp.adicionar(67);
        abp.adicionar(63);

        System.out.println(abp.existe(32));
        System.out.println(abp.existe(60));
        System.out.println(abp.existe(61));
        System.out.println(abp.getCaminhoPreOrdem());
        System.out.println(abp.getCaminhoPosOrdem());
        System.out.println(abp.getCaminhoLargura());

        abp.imprimirArvore();

        System.out.println("Remover ");
        abp.remover(70);
        System.out.println("");
        System.out.println("");
        System.out.println("");

        abp.imprimirArvore();

        System.out.println("Remover ");
        abp.remover(85);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        abp.imprimirArvore();

        System.out.println(abp.toDot());
        abp.remover(60);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        abp.imprimirArvore();
        System.out.println(abp.toDot());


    }
}
