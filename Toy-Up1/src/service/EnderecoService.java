package service;

import entity.Endereco;

import java.util.Scanner;

public class EnderecoService {
    Endereco endereco = new Endereco();
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
}
