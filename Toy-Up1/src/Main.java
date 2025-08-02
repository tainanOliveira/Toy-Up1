import entity.Cliente;
import entity.Endereco;
import entity.Pedido;
import entity.Produto;
import service.ClienteService;
import service.ProdutoService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ProdutoService.novosProdutos(produtos);
        Boolean cadastrado = false;



        int escolha;
        do {

            System.out.println(
                    "\n\n====Toy-Up===\n"+
                            "Escolha uma Opção\n"+
                            "1- Cadastrar Usuário\n"+
                            "2- Categoria\n"+
                            "3- Produtos em geral \n"+
                            "4- sugestão\n"+
                            "5- Perfil\n"+
                            "6- \n"+

                            "7- Sair"
            );
            escolha = entrada.nextInt();


        switch (escolha) {
            case 1:
                ClienteService.novoCliente(clientes);
                 cadastrado = true;
                break;
            case 2:
                break;
            case 3:
                ProdutoService.produtosGeral(produtos);
                break;
            case 4:
                ProdutoService.produtosSugestao(produtos);
                break;
            case 5:
                if (cadastrado){
                    ClienteService.mostrarCliente(clientes);

                }else {
                    System.out.println("Cliente não encontrado, se cadastre!");
                    ClienteService.novoCliente(clientes);
                }
                break;
            default:
                break;
        }
        }while(escolha != 7);

    }

}

