package aula05_recursao_exercicios;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continua=true;
        while(continua) {
            System.out.println("Digite o número para calular o fatorial (-1 para sair): ");
            int numero = teclado.nextInt();
            if(numero<0) continua=false;
            else {
                System.out.println(fatorialRecursivo(numero));
                System.out.println(fatorialNaoRecursivo(numero));
            }
        }
    }
    public static int fatorialRecursivo(int n) {
        System.out.println("IMPLEMENTAR...");
        return -1;
    }

    public static int fatorialNaoRecursivo(int n) {
        System.out.println("IMPLEMENTAR...");
        return -1;
    }

}
