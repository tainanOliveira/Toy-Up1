package service;

import entity.Cliente;
import entity.Pagamento;
import entity.Pedido;
import entity.Produto;

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
    public static Pedido cadastrarPedido(ArrayList<Produto> carrinho, ArrayList<Cliente> clientes, Pagamento pagamento){



        return new Pedido();
    }

}
