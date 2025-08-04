import entity.*;
import service.ClienteService;
import service.PedidoService;
import service.ProdutoService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Produto> carrinho = new ArrayList<>();
        Pedido pedidoAtual = null;

        ProdutoService.novosProdutos(produtos);
        boolean cadastrado = false;
        boolean carrinhoFinalizado = false;
        int categoria,escolha ;

        do {
            System.out.println(
                    """
                            
                            
                            ====Toy-Up===
                            Escolha uma Opção
                            1- Cadastrar Usuário
                            2- Categoria
                            3- Produtos em geral\s
                            4- sugestão
                            5- Perfil
                            6- Pedidos
                            7- Carrinho
                            8- Sair"""
            );
            escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                //Cadastrar Usuário
                 ClienteService.novoCliente(clientes);
                 cadastrado = true;
                break;
            case 2:
                //Categoria
                System.out.println("1-MARCA\n2-IDADE\n3-PREÇO MINIMO");
                categoria = entrada.nextInt();
                switch (categoria){
                    case 1:
                        ProdutoService.filtrarPorMarca(produtos);
                        carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));
                        carrinhoFinalizado = false;

                        break;
                    case 2:
                        ProdutoService.filtrarPorIdade(produtos);
                        carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));
                        carrinhoFinalizado = false;
                        break;
                    case 3:
                        ProdutoService.filtrarPorPrecoMinimo(produtos);
                        carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));
                        carrinhoFinalizado = false;
                        break;
                    default:
                        System.err.println("Invalido!!");
                        break;
                }
                break;
            case 3:
                ProdutoService.produtosGeral(produtos);
                carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));
                carrinhoFinalizado = false;
                break;
            case 4:
                //sugestão
                ProdutoService.produtosSugestao(produtos);
                carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));
                carrinhoFinalizado = false;
                break;
            case 5:
                // Perfil
                if (cadastrado) {
                    ClienteService.mostrarCliente(clientes);

                    System.out.print("Alterar (S/N): ");
                    String alterar = entrada.next().trim().toLowerCase();

                    if (alterar.equals("s")) {
                        ClienteService.alterarCliente(clientes);
                    } else if (!alterar.equals("n")) {
                        System.out.println("Digite apenas (S ou N).");
                    }
                } else {
                    System.out.println("Usuário não encontrado. Realize o cadastro.");
                    ClienteService.novoCliente(clientes);
                           }
                break;
            case 6:
                //Pedido]

                if (pedidoAtual != null) {
                    System.out.println(pedidoAtual);
                    System.out.println("Total: "+pedidoAtual.calcularTotal(carrinho));
                    System.out.println("Frete: "+pedidoAtual.calcularFrete(clientes));
                    }else {
                    System.out.println("Nenhum Pedido feito");
                }

                break;

            case 7:
                if (cadastrado) {
                    if (!carrinho.isEmpty()) {

                        if (carrinhoFinalizado) {
                            System.out.println("Você já finalizou este pedido.");
                            System.out.println("Adicione novos produtos para poder finalizar novamente.");
                            break;
                        }
                        // Lista os produtos no carrinho
                        PedidoService.listaProdutoCarrinho(carrinho);

                        System.out.println("Finalizar pedido? (s/n)");
                        String finalizarPedido = entrada.next().toLowerCase();

                        if (finalizarPedido.equals("s") || finalizarPedido.equals("sim")) {
                            pedidoAtual = PedidoService.cadastrarPedido(carrinho, clientes);

                            if (pedidoAtual != null) {
                                System.out.println("Pedido realizado com sucesso:");
                                System.out.println(pedidoAtual);
                                System.out.println("Total: " + pedidoAtual.calcularTotal(carrinho));
                                System.out.println("Frete: " + pedidoAtual.calcularFrete(clientes));
                                carrinho.clear(); // Limpa o carrinho após o pedido
                                carrinhoFinalizado = true;

                            } else {
                                System.err.println("Falha ao cadastrar pedido.");
                            }
                        } else {
                            System.out.println("Pedido não finalizado.");
                        }
                    } else {
                        System.out.println("Carrinho está vazio.");
                    }
                } else {
                    System.out.println("Usuário não encontrado. Realize o cadastro.");
                    ClienteService.novoCliente(clientes);
                    cadastrado = true;
                }
                break;
            default:
                System.err.println("Invalido!!");
                break;
        }
        }while(escolha != 8);

    }

}

