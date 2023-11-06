package Apoio_T2;

public class ListaNotaFiscal {
    private NotaFiscal inicio;
    private NotaFiscal fim;
    private int quantidade;
    public ListaNotaFiscal() {
        inicio = new NotaFiscal();
        fim = new NotaFiscal();
        inicio.setProximo(fim);
        fim.setAnterior(inicio);
    }
    public void adicionar(NotaFiscal nf) {
        nf.setProximo(fim);
        nf.setAnterior(fim.getAnterior());
        fim.getAnterior().setProximo(nf);
        fim.setAnterior(nf);
        quantidade++;
    }
}
