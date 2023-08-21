package aula05_recursao_respostas;

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
        if(n==0 || n==1) return 1;
        else return n * fatorialRecursivo(n - 1);
    }

    public static int fatorialNaoRecursivo(int n) {
        //tem um bug, alunos devem isolar e corrigir
        for (int i = n; i >=2 ; i--) {
            n = n * (i - 1);
        }
        return n;
    }

}
