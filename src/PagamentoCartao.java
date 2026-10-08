public class PagamentoCartao implements FormaPagamento {
    @Override
    public double calcularValorFinal(double valorOriginal) {
        return valorOriginal * 1.05;
    }
}
