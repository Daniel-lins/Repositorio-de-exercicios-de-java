package Exercicio4PO;

public class Invoice {

    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnidade;

    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnidade) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnidade(precoUnidade);

    }

    public double getInvoiceAmout() {
        return quantidade * precoUnidade;

    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;

        } else {
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(float precoUnidade) {
        if (precoUnidade < 0) {
            this.precoUnidade = 0;
        } else {
            this.precoUnidade = precoUnidade;
        }
    }

}
