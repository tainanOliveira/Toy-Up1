package entity;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private Pagamento pagamento;
    private Double total;
    private Double frete;

    public Pedido() {
    }

    public Pedido(Cliente cliente, List<Produto> produtos, Pagamento pagamento, Double total, Double frete) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.pagamento = pagamento;
        this.total = total;
        this.frete = frete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }


    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", produtos=" + produtos +
                ", pagamento=" + pagamento +
                ", total=" + total +
                ", frete=" + frete +
                '}';
    }

    public Double calcularTotal() {
        double soma = 0.0;
        if (produtos != null) {
            for (Produto produto : produtos) {
                soma += produto.getPreco();
            }
        }
        this.total = soma;
        return total;
    }

    public Double calculoFrete() {
        if (total == null) {
            calcularTotal();
        }
        if (total > 120) {
            frete = 0.0;
        } else {
            frete = 60.0;
        }
        return frete;
    }
}
