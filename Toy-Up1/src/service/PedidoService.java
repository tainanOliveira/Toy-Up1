package service;

import entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PedidoService {


    public static ArrayList<Produto> selecionarProdutosParaPedido(ArrayList<Produto> produtos) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> carrinho = new ArrayList<>();
        boolean loop = true;
        int idSelecionado;

        while (loop) {
            System.out.print("Selecione o produto pelo ID: ");
             idSelecionado = entrada.nextInt();
            boolean encontrado = false;

            for (Produto produto : produtos) {
                if (idSelecionado == produto.getIdProduto()) {
                    carrinho.add(produto);
                    System.out.println("Produto selecionado com sucesso: " + produto.getNomeProduto());
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.err.println("Produto com esse ID não existe!");
            }

            System.out.print("Deseja selecionar outro produto? (s/n): ");
            String novoProduto = entrada.next().toLowerCase();
            if (!novoProduto.equals("s")) {
                loop = false;
            }
        }

        return carrinho;


}
    public static  void listaProdutoCarrinho ( ArrayList<Produto> carrinho) {

        for (Produto produto : carrinho) {
            System.out.println(produto.produtoCarrinho());
        }


    }
    public static Pedido cadastrarPedido(ArrayList<Produto> carrinho, ArrayList<Cliente> clientes) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = clientes.get(0);

        // Escolher pagamento
        System.out.println("Escolha o tipo de pagamento:");
        System.out.println("1 - CRÉDITO");
        System.out.println("2 - DÉBITO");
        System.out.println("3 - PIX");

        int opcao = entrada.nextInt();
        TipoPagamento tipo = null;

        switch (opcao) {
            case 1 -> tipo = TipoPagamento.CREDITO;
            case 2 -> tipo = TipoPagamento.DEBITO;
            case 3 -> tipo = TipoPagamento.PIX;
            default -> {
                System.err.println("Tipo de pagamento inválido!");
                return null;
            }
        }

        Pagamento pagamento = new Pagamento(tipo);

        return new Pedido(cliente, new ArrayList<>(carrinho), pagamento);
    }
}
