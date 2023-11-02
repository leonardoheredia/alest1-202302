package Apoio_T2;

import java.util.Date;

public class NotaFiscal {
    private String numero;
    private Date data;
    private String cliente;
    private String cnpjCpf;
    private String endereco;
    private String cidade;
    private String estado;
    private ListaItemNotaFiscal itens;
    public NotaFiscal proximo;
    public NotaFiscal anterior;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ListaItemNotaFiscal getItens() {
        return itens;
    }

    public void setItens(ListaItemNotaFiscal itens) {
        this.itens = itens;
    }

    public NotaFiscal getProximo() {
        return proximo;
    }

    public void setProximo(NotaFiscal proximo) {
        this.proximo = proximo;
    }

    public NotaFiscal getAnterior() {
        return anterior;
    }

    public void setAnterior(NotaFiscal anterior) {
        this.anterior = anterior;
    }
}
