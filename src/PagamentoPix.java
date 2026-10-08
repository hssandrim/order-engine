public class PagamentoPix implements FormaPagamento {
    @Override
    public double calcularValorFinal(double valorOriginal) {
        return valorOriginal * 0.90;
    }
}