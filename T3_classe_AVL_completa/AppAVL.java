package T3_classe_AVL_completa;

public class AppAVL {
    public static void main(String[] args) {
        //50, 30, 70, 10, 40, 35
        ArvoreAVL a = new ArvoreAVL();
        a.adicionar(50);
        a.adicionar(40);
        a.adicionar(30);

        a.imprimirArvore();

        System.out.println();
        a.percorrerEmPreOrdem();
    }
}
