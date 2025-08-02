package entity;

import java.util.ArrayList;
import java.util.HashMap;
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
                "\nCliente: " + cliente.getNome() +
                " | CPF: " + cliente.getCpf() +
                "\nProdutos: " + produtos +
                "\nPagamento: " + pagamento +
                "\nTotal: R$ " + String.format("%.2f", total) +
                "\nFrete: R$ " + String.format("%.2f", frete) +
                "\n}";
    }

    public static void CalcularFrete(ArrayList<Cliente> clientes) {
        HashMap<String, Double> fretePorEstado = new HashMap<>();
        fretePorEstado.put("AC", 30.0);
        fretePorEstado.put("AL", 25.0);
        fretePorEstado.put("AP", 32.0);
        fretePorEstado.put("AM", 35.0);
        fretePorEstado.put("BA", 20.0);
        fretePorEstado.put("CE", 22.0);
        fretePorEstado.put("DF", 18.0);
        fretePorEstado.put("ES", 17.0);
        fretePorEstado.put("GO", 19.0);
        fretePorEstado.put("MA", 23.0);
        fretePorEstado.put("MT", 26.0);
        fretePorEstado.put("MS", 24.0);
        fretePorEstado.put("MG", 15.0);
        fretePorEstado.put("PA", 28.0);
        fretePorEstado.put("PB", 21.0);
        fretePorEstado.put("PR", 14.0);
        fretePorEstado.put("PE", 21.0);
        fretePorEstado.put("PI", 24.0);
        fretePorEstado.put("RJ", 12.0);
        fretePorEstado.put("RN", 20.0);
        fretePorEstado.put("RS", 13.0);
        fretePorEstado.put("RO", 30.0);
        fretePorEstado.put("RR", 33.0);
        fretePorEstado.put("SC", 13.0);
        fretePorEstado.put("SP", 10.0);
        fretePorEstado.put("SE", 22.0);
        fretePorEstado.put("TO", 27.0);

        for (Cliente cliente : clientes) {
            String estado = cliente.getEndereco().getEstado().toUpperCase();
            Double valorFrete = fretePorEstado.getOrDefault(estado, 0.0);

            System.out.println("Estado: " + estado + " - Frete: R$ " + valorFrete);
        }
    }
}
