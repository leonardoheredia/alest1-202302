package aula05_recursao_respostas;

public class Somatorio {
    public static void main(String[] args) {
        int n=5;
        System.out.println("somatorioNaoRecursivoN_0(" + n + "): " + somatorioNaoRecursivoN_0(n));
        System.out.println("somatorioNaoRecursivo0_N(" + n + "): " + somatorioNaoRecursivo0_N(n));

        System.out.println("");
        System.out.println("somatorioRecursivo0_N(" + n + "): ");
        System.out.println(somatorioRecursivo0_N(n));

        System.out.println("");
        System.out.println("somatorioRecursivoN_0(" + n + "): ");
        System.out.println(somatorioRecursivoN_0(0, n));

    }
    public static int somatorioNaoRecursivoN_0(int n) {
        System.out.printf("%n %d", n);
        for (int i = n-1; i >=0 ; i--) {
            System.out.printf(" %d + ", i);
            n = n + i;
        }
        System.out.printf(" = %d %n", n);
        return n;
    }
    public static int somatorioNaoRecursivo0_N(int n) {
        int r = 0;
        System.out.printf("%n %d", r);
        for (int i = r+1; i <=n ; i++) {
            System.out.printf(" + %d", i);
            r = r + i;
        }
        System.out.printf(" = %d %n", r);
        return r;
    }
    public static int somatorioRecursivo0_N(int n) {
        if(n==0) {
            System.out.printf(" %d = ", n);
            return n;
        }
        else {
            System.out.printf(" %d +", n);
            return  n + somatorioRecursivo0_N(n - 1);
        }
    }
    public static int somatorioRecursivoN_0(int i, int n) {
        if(i==n) {
            System.out.printf(" %d = ", n);
            return n;
        }
        else {
            System.out.printf(" %d +", i);
            return  i + somatorioRecursivoN_0(i+1, n);
        }
    }

}
