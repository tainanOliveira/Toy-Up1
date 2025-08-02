package service;

import entity.Cliente;
import entity.Endereco;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    Cliente cliente = new Cliente();

    public static void novoCliente(ArrayList<Cliente> clientes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("==Cadastro Cliente==");
        System.out.print("Nome: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("CPF: ");
        String cpfCliente = entrada.nextLine();

        System.out.print("Telefone: ");
        String telefoneCliente = entrada.nextLine();

        System.out.print("E-mail: ");
        String emailCliente = entrada.nextLine();

        Endereco endereco = EnderecoService.novoEndereco();

        String senhaCliente;
        while (true) {
            System.out.print("Senha: ");
            senhaCliente = entrada.nextLine();

            System.out.print("Confirmar senha: ");
            String confirmarSenha = entrada.nextLine();

            if (senhaCliente.equals(confirmarSenha)) {
                break;
            } else {
                System.out.println("Senhas não coincidem. Tente novamente!");
            }
        }

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente, emailCliente, endereco, senhaCliente);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }
    public static void mostrarCliente(ArrayList<Cliente> clientes){
        for (Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }


}
