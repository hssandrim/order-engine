public class ItemPedido {
    private Produto produto;
    private int quantidade;

    // CONSTRUTOR
    public ItemPedido(Produto produto, int quantidade) {

        this.produto = produto;
        setQuantidade(quantidade);
    }

    // METODO CALCULAR SubTotal
    public double calcularSubTotal() {
        return quantidade * produto.getPreco();
    }

    // GETTERS
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // SETTERS
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que 0!");
        }
        this.quantidade = quantidade;
    }
}
