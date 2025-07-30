import entity.Cliente;
import entity.Endereco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("Novo Cliente");
        novoCliente(clientes);

        for (Cliente c : clientes){
            System.out.println("\n\n\n"+c);
        }
    }

    public static void novoCliente(ArrayList<Cliente> clientes){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("CPF: ");
        String cpfCliente = entrada.nextLine();

        System.out.print("Telefone: ");
        String telefoneCliente = entrada.nextLine();

        System.out.print("E-mail: ");
        String emailCliente = entrada.nextLine();

        // Cadastro de Endereço
        System.out.println("=== Endereço ===");
        System.out.print("Rua: ");
        String ruaCliente = entrada.nextLine();

        System.out.print("Cidade: ");
        String cidadeCliente = entrada.nextLine();

        System.out.print("Estado: ");
        String estadoCliente = entrada.nextLine();

        System.out.print("CEP: ");
        String cepCliente = entrada.nextLine();

        System.out.print("Número: ");
        String numeroCasaCliente = entrada.nextLine();

        System.out.print("Complemento (opcional): ");
        String complementoCliente = entrada.nextLine();

        // Confirmação de senha
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

        // Criação do endereço e do cliente
        Endereco endereco = new Endereco(ruaCliente, cidadeCliente, estadoCliente, cepCliente, numeroCasaCliente, complementoCliente);
        Cliente cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente, emailCliente, endereco, senhaCliente);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }


}

