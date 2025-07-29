package entity;

public class Produto {
    private Long idProduto;
    private String nomeProduto;
    private Double preco;
    private String categoria;
    private String marca;
    private String descProduto;

    public Produto() {
    }

    public Produto(Long idProduto, String nomeProduto, Double preco, String categoria, String marca, String descProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
        this.descProduto = descProduto;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
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

    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                ", descProduto='" + descProduto + '\'' +
                '}';
    }
}
