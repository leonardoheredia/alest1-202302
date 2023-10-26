package Apoio_T2;

public class ItemNotaFiscal {
    private String itemNumero;
    private String descricao;
    private int quantidade;
    private double valorUnitario;
    public ItemNotaFiscal proximo;
    public ItemNotaFiscal(String itemNumero, String descricao,
                          int quantidade, double valorUnitario) {
        this.itemNumero = itemNumero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    public double getValorTotalItem() {
        return quantidade * valorUnitario;
    }

    public String getItemNumero() {
        return itemNumero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public String toString() {
        return "ItemNotaFiscal{" +
                "itemNumero='" + itemNumero + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", proximo=" + proximo +
                '}';
    }
}
