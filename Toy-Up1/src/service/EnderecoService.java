package service;

import entity.Endereco;

import java.util.Scanner;

public class EnderecoService {

    public static Endereco novoEndereco() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Endereço ===");
        System.out.print("Rua: ");
        String rua = entrada.nextLine();

        System.out.print("Cidade: ");
        String cidade = entrada.nextLine();

        System.out.print("Estado: ");
        String estado = entrada.nextLine();

        System.out.print("CEP: ");
        String cep = entrada.nextLine();

        System.out.print("Número: ");
        String numero = entrada.nextLine();

        System.out.print("Complemento (opcional): ");
        String complemento = entrada.nextLine();

        return new Endereco(rua, cidade, estado, cep, numero, complemento);
    }
    public static void alterarEndereco(Endereco endereco) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Alterar Endereço ===");

        System.out.print("Nova rua (" + endereco.getRua() + "): ");
        String rua = entrada.nextLine();
        if (!rua.isEmpty()) endereco.setRua(rua);

        System.out.print("Nova cidade (" + endereco.getCidade() + "): ");
        String cidade = entrada.nextLine();
        if (!cidade.isEmpty()) endereco.setCidade(cidade);

        System.out.print("Novo estado (" + endereco.getEstado() + "): ");
        String estado = entrada.nextLine();
        if (!estado.isEmpty()) endereco.setEstado(estado);

        System.out.print("Novo CEP (" + endereco.getCep() + "): ");
        String cep = entrada.nextLine();
        if (!cep.isEmpty()) endereco.setCep(cep);

        System.out.print("Novo número (" + endereco.getNumero() + "): ");
        String numero = entrada.nextLine();
        if (!numero.isEmpty()) endereco.setNumero(numero);

        System.out.print("Novo complemento (" + endereco.getComplemento() + "): ");
        String complemento = entrada.nextLine();
        if (!complemento.isEmpty()) endereco.setComplemento(complemento);

        System.out.println("Endereço alterado com sucesso!");
    }

}
