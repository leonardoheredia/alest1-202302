package aula05_recursao_exercicios;

public class Mensagem {
    /*Implemente um método recursivo em Java que escreva uma mensagem na tela n vezes*/
    public static void main(String[] args) {
        mensagemNaoRecursiva("Internacional Campeao de Tudo! - nao recursivo", 5);
        mensagemRecursiva("Internacional Campeao de Tudo! - recursivo", 5);
    }
    public static void mensagemNaoRecursiva(String m, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(m);
        }
    }
    public static void mensagemRecursiva(String m, int n) {
        System.out.println("IMPLEMENTAR...");
    }
}
