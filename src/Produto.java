public class Produto {
    private long id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // CONSTRUTOR
    public Produto(long id, String nome, double preco, int quantidadeEstoque) {

        this.id = id;
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNome() {
        this.nome = nome;
    }

    public void setPreco(double preco) {

        if (preco < 0.0) {
            throw new IllegalArgumentException("Preço não pode ser negativo!");
        }

        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa!");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }


}
