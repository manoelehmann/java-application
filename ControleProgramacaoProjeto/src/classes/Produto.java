package classes;

public class Produto {
    // ATRIBUTOS
    private int idProduto;
    private String descricao;
    private String unidade; // KG, LT, MT, UN...
    private float preco;
    
    // METODOS
    // USAR GETTER AND SETTER, CLICANDO NO BOTÃO DO MOUSE DIREITO
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
