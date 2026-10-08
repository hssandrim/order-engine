import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private long id;
    private List<ItemPedido> itens;
    private StatusPedido status;
    private FormaPagamento formaPagamento;

    // CONSTRUTOR
    public Pedido(long id, FormaPagamento formaPagamento) {

        this.id = id;
        this.itens = new ArrayList<>();
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
        this.formaPagamento = formaPagamento;
    }

    // METODO: ADICIONAR ITEM
    public void adicionarItem(ItemPedido item) {
        if (item.getQuantidade() > item.getProduto().getQuantidadeEstoque()) {
            throw new IllegalArgumentException("Quantidade insuficiente para o produto: " + item.getProduto().getNome());
        }
        itens.add(item);
    }

    // METODO: CALCULAR TOTAL BRUTO
    public double calcularTotalBruto() {
        double total = 0.0;

        for (ItemPedido item : itens) {
            total += item.calcularSubTotal();
        }
        return total;
    }

    // METODO: PROCESSAR PAGAMENTO
    public double processarPagamento() {
        double totalBruto = calcularTotalBruto();

        double valorFinal = formaPagamento.calcularValorFinal(totalBruto);

        for (ItemPedido item : itens) {
            item.getProduto().setQuantidadeEstoque(item.getProduto().getQuantidadeEstoque() - item.getQuantidade());
        }

        this.status = StatusPedido.PAGO;

        return valorFinal;
    }

    // METODO: ENVIAR PEDIDO
    public void enviarPedido() {
        if (this.status != StatusPedido.PAGO) {
            throw new IllegalStateException("O pedido não pode ser enviado, pois ainda não foi pago!");
        }
        this.status = StatusPedido.ENVIADO;
    }

    // GETTERS
    public long getId() {
        return this.id;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }

    public StatusPedido getStatus() {
        return this.status;
    }

    public FormaPagamento getFormaPagamento() {
        return this.formaPagamento;
    }


}
