package entity;


public class Cliente {
    private static Integer autoIncremento = 1; // contador global para todos os clientes

    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;
    private String senha;

    public Cliente() {}

    public Cliente(String nome, String cpf, String telefone, String email, Endereco endereco, String senha) {
        this.id = autoIncremento++;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String toString() {
        return "Perfil\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "E-mail: " + email + "\n" +
                "==Endereço==:\n Rua/ "+endereco.getRua()+"\nCidade/ "+endereco.getCidade()+"\nEstado/ "+endereco.getEstado()+"\n";

    }
}
