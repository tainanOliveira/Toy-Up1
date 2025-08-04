package entity;

public class Produto {
    private int idProduto;
    private  String nomeProduto;
    private  Double preco;
    private  String categoria;
    private String marca;
    private Integer idade;
    private String descProduto;

    public Produto() {
    }

    public Produto(int idProduto, String nomeProduto, Double preco, String categoria, String marca, Integer idade, String descProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.idade = idade;
        this.descProduto = descProduto;
    }

    public int getIdProduto(int id) {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String toString() {
        return "\n=== Produto ===" +
                "\nID: " + idProduto +
                "\nNome: " + nomeProduto +
                "\nPreço: R$ " + String.format("%.2f", preco) +
                "\nCategoria: " + categoria +
                "\nMarca: " + marca +
                "\nDescrição: " + descProduto +
                "\nIdade: "+idade;
    }

    public String produtoCarrinho() {
        return "\n=== Produto ===" +
                "\nNome: " + nomeProduto +
                "\nPreço: R$ " + String.format("%.2f", preco) +
                "\nCategoria: " + categoria ;
    }




}
