package aula13_listasencadeadas;

public class ListaDuplamenteEncadeada {
    private class Nodo {
        String item;
        Nodo anterior;
        Nodo proximo;
        public Nodo(String item) {
            this.item = item;
        }
    }
    private Nodo inicio;
    private Nodo fim;
    private int quantidade;
    public ListaDuplamenteEncadeada() {
        quantidade = 0;
        inicio = new Nodo(null);
        fim = new Nodo(null);
        inicio.anterior = null;
        inicio.proximo = fim;
        fim.proximo = null;
        fim.anterior = inicio;

    }
    public void adicionar(int posicao, String item) {
        Nodo aux = inicio.proximo;
        int p = 0;
        while(aux!=null) {
            if(posicao==p) { //posicao para inserir no aux
                Nodo n = new Nodo(item);
                n.proximo = aux;
                n.anterior = aux.anterior;
                aux.anterior.proximo = n;
                aux.anterior = n;
                quantidade++;
                return;
            }
            aux = aux.proximo;
            p++;
        }
    }

    public int buscar(String item) {
        Nodo aux = inicio.proximo;
        int p = 0;
        while (aux!=fim) {
            if(aux.item.equals(item)) return p;
            aux = aux.proximo;
            p++;
        }
        return -1;
    }



    public void adicionar(String item) {
        /*Nodo n = new Nodo(item);
        fim.anterior.proximo = n;
        n.proximo = fim;
        n.anterior = fim.anterior;
        fim.anterior = n;
        quantidade++;
         */
    }

    @Override
    public String toString() {
        String r = "";
        for(Nodo n = inicio.proximo; n!=fim; n=n.proximo) {
            r = r + " " + n.item;
        }
        return r + " - Qtd = " + quantidade;
    }

    public static void main(String[] args) {
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
        l.adicionar(0,"Joao");
        l.adicionar(1,"Maria");
        l.adicionar(2, "Tales");
        l.adicionar(1,"Pirulito");
        l.adicionar(4,"Mariana");
        l.adicionar(5,"Anita");
        l.adicionar(6,"Clara");

        System.out.println(l);
        System.out.println(l.buscar("Joao"));
        System.out.println(l.buscar("Anita"));
        System.out.println(l.buscar("Alexandre"));



        System.out.println(l);
    }



}
