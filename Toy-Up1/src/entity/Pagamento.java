package entity;

public class Pagamento {
    private TipoPagamento tipo;


    public Pagamento() {
    }

    public Pagamento(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }


    public String toString() {
        return "Pagamento{" +
                "tipo=" + tipo +
                '}';
    }
}
