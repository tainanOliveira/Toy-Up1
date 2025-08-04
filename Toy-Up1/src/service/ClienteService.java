package service;

import entity.Cliente;
import entity.Endereco;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {


    public static void novoCliente(ArrayList<Cliente> clientes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("==Cadastro Usuário==");
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

        System.out.println("Usuário cadastrado com sucesso!");
    }
    public static void mostrarCliente(ArrayList<Cliente> clientes){
        for (Cliente cliente : clientes){
            System.out.println(cliente);}
    }
    public static void alterarCliente(ArrayList<Cliente> clientes) {
        Scanner entrada = new Scanner(System.in);

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        Cliente cliente = clientes.get(0); // Pega o único cliente existente

        System.out.println("== Alteração de Usuário ==");

        System.out.print("Novo nome: ");
        String nomeCliente = entrada.nextLine();
        cliente.setNome(nomeCliente);

        System.out.print("Novo CPF: ");
        String cpfCliente = entrada.nextLine();
        cliente.setCpf(cpfCliente);

        System.out.print("Novo telefone: ");
        String telefoneCliente = entrada.nextLine();
        cliente.setTelefone(telefoneCliente);

        System.out.print("Novo e-mail: ");
        String emailCliente = entrada.nextLine();
        cliente.setEmail(emailCliente);

        System.out.println("== Alterar Endereço ==");
        EnderecoService.alterarEndereco(cliente.getEndereco());

        while (true) {
            System.out.print("Nova senha: ");
            String senha = entrada.nextLine();

            System.out.print("Confirmar nova senha: ");
            String confirmarSenha = entrada.nextLine();

            if (senha.equals(confirmarSenha)) {
                cliente.setSenha(senha);
                break;
            } else {
                System.out.println("Senhas não coincidem. Tente novamente!");
            }
        }

        System.out.println("Usuário alterado com sucesso!\n");
    }
}
