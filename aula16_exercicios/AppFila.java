package aula16_exercicios;

public class AppFila {
    public static void main(String[] args) {
        FilaEncadeada f = new FilaEncadeada();
        f.enfileirar("Sandro");
        f.enfileirar("Ze");
        f.enfileirar("Reinaldo");
        System.out.println(f); //valor esperado é Sandro Ze Reinaldo

        System.out.println(f.desenfileirar());
        System.out.println(f); //valor esperado é Ze Reinaldo
    }
}
