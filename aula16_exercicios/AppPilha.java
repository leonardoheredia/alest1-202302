package aula16_exercicios;

public class AppPilha {
    public static void main(String[] args) {
        PilhaEncadeada p = new PilhaEncadeada();
        p.empilhar("Laranja");
        p.empilhar("Chocolate");
        p.empilhar("Amora");
        System.out.println(p); // Amora  Chocolate   Laranja
        System.out.println(p.desempilhar()); // Remove Amora
        System.out.println(p); // Chocolate   Laranja
        System.out.println(p.desempilhar()); //remove Chocolate
        System.out.println(p); // Laranja

    }
}
