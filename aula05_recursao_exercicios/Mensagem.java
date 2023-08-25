package aula05_recursao_exercicios;

public class Mensagem {
    /*Implemente um método recursivo em Java que escreva uma mensagem na tela n vezes*/
    public static void main(String[] args) {
        mensagemRecursiva("Oi!!!", 5);
    }

    public static void mensagemRecursiva(String m, int n) {
        if(n>1) mensagemRecursiva(m, n-1);
        System.out.println(m);
    }
    public static void mensagemNaoRecursiva(String m, int n) {
        while(n>0) {
            System.out.println(m);
            n--;
        }
    }

}
