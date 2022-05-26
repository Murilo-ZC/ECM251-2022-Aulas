public abstract class Produto implements IGerarDesconto{
    private final double preco;
    private int quantidade;
    private final String descricao;
    private final String nome;
    public Produto(double preco, int quantidade, String descricao, String nome) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getNome() {
        return nome;
    }
}