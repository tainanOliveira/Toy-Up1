import entity.Cliente;
import entity.Endereco;
import entity.Pedido;
import entity.Produto;
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

        ProdutoService.novosProdutos(produtos);
        boolean cadastrado = false;
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
                            6- Pedido
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

                        break;
                    case 2:
                        ProdutoService.filtrarPorIdade(produtos);
                        carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));

                        break;
                    case 3:
                        ProdutoService.filtrarPorPrecoMinimo(produtos);
                        carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));

                        break;
                    default:
                        System.err.println("Invalido!!");
                        break;
                }
                break;
            case 3:
                ProdutoService.produtosGeral(produtos);
                carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));

                break;
            case 4:
                //sugestão
                ProdutoService.produtosSugestao(produtos);
                carrinho.addAll(PedidoService.selecionarProdutosParaPedido(produtos));

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
                //Pedido








                break;

            case 7:
                //Carrinh
               PedidoService.listaProdutoCarrinho(carrinho);
                System.out.println("Finalizar pedido?");
                String finalizarPedido = entrada.next();
                if (finalizarPedido.toLowerCase().equals("s") || finalizarPedido.toLowerCase().equals("sim")){


                    }

                break;
            default:
                System.err.println("Invalido!!");
                break;
        }
        }while(escolha != 8);

    }

}

