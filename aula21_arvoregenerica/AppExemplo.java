package aula21_arvoregenerica;

public class AppExemplo {
    public static void main(String[] args) {
        ArvoreGenerica arvore = new ArvoreGenerica("BRASIL");
        arvore.adicionarNodo("RS", "BRASIL");
        arvore.adicionarNodo("SC", "BRASIL");
        arvore.adicionarNodo("PR", "BRASIL");
        arvore.adicionarNodo("POA", "RS");
        arvore.adicionarNodo("NH", "RS");
        arvore.adicionarNodo("SL", "RS");
        arvore.adicionarNodo("CT", "PR");

        System.out.println("Tamanho = " + arvore.getTamanho());

        boolean b = arvore.existe("PR");
        arvore.percorrer();
        /*
        */

    }
}
