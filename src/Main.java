class Main {
    public static void main(String[] args) {


        Produto p1 = new Produto(1L, "Notebook", 3500.0, 10);
        Produto p2 = new Produto(2L, "Mouse", 900, 10);

        FormaPagamento pagamento1 = new PagamentoPix();
        FormaPagamento pagamento2 = new PagamentoCartao();

        Pedido pedido1 = new Pedido(p1.getId(), pagamento1);
        Pedido pedido2 = new Pedido(p2.getId(), pagamento2);

        ItemPedido itemPedido1 = new ItemPedido(p1, 2);
        ItemPedido itemPedido2 = new ItemPedido(p2, 2);
        pedido1.adicionarItem(itemPedido1);
        pedido2.adicionarItem(itemPedido2);

        System.out.println("Status do Pedido: " + pedido1.getStatus());
        System.out.println("Item e Quantidade: " + p1.getNome() + pedido1.getItens());
        System.out.println("Valor do Pedido 1: " + pedido1.calcularTotalBruto());

        double valorPago1 = pedido1.processarPagamento();
        System.out.println("Valor pago do Pedido 1 (desconto de 10%): " + valorPago1);

        System.out.println("Status do Pedido 1: " + pedido1.getStatus());
        System.out.println("Estoque do Produto 1: " + p1.getQuantidadeEstoque());
        pedido1.enviarPedido();
        System.out.println("Status atualizado do Pedido 1: " + pedido1.getStatus());

        System.out.println("=====================");

        try {
            pedido2.enviarPedido();
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado capturado: " + e.getMessage());
        }


    }
}
