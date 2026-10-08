public class PagamentoBoleto implements FormaPagamento {
    @Override
    public double calcularValorFinal(double valorOriginal) {
        return valorOriginal;
    }
}