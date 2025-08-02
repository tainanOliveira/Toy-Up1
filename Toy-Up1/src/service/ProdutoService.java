package service;

import entity.Produto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ProdutoService {
    Produto produtos = new Produto();

    public  static  void novosProdutos(ArrayList<Produto> produtos){
        produtos.add(new Produto(1, "Carrinho de Controle Remoto", 150.00, "Brinquedos", "FunToys", "Carrinho com controle remoto, alcance de 30 metros"));
        produtos.add(new Produto(2, "Boneca Barbie Fashion", 120.50, "Brinquedos", "FunToys", "Boneca com roupas e acessórios variados"));
        produtos.add(new Produto(3, "Quebra-Cabeça 500 peças", 75.00, "Brinquedos", "PuzzleMaster", "Quebra-cabeça com imagem de paisagem colorida"));
        produtos.add(new Produto(4, "Jogo de Tabuleiro Banco Imobiliário", 130.00, "Brinquedos", "PuzzleMaster", "Clássico jogo de tabuleiro para toda família"));
        produtos.add(new Produto(5, "Blocos de Montar", 89.90, "Brinquedos", "BuildIt", "Kit com 200 blocos de montar coloridos"));
        produtos.add(new Produto(6, "Dinossauro Robô", 200.00, "Brinquedos", "BuildIt", "Dinossauro que anda e emite sons realistas"));
        produtos.add(new Produto(7, "Bola Inflável", 35.00, "Brinquedos", "FunToys", "Bola de praia inflável com design colorido"));
        produtos.add(new Produto(8, "Carrinho Hot Wheels", 40.00, "Brinquedos", "FunToys", "Mini carrinho colecionável Hot Wheels"));
        produtos.add(new Produto(9, "Lego Star Wars", 300.00, "Brinquedos", "BuildIt", "Kit Lego da série Star Wars com 500 peças"));
        produtos.add(new Produto(10, "Boneco de Ação Super-Herói", 95.00, "Brinquedos", "PuzzleMaster", "Boneco articulado com acessórios"));
        produtos.add(new Produto(11, "Massinha de Modelar", 25.00, "Brinquedos", "FunToys", "Kit com 10 potes de massinha colorida"));
        produtos.add(new Produto(12, "Patinete Infantil", 350.00, "Brinquedos", "BuildIt", "Patinete com três rodas para crianças"));
    }

    public  static  void produtosGeral(ArrayList<Produto> produtos){
        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }
    public static  void produtosSugestao(ArrayList<Produto> produtos){
       // Random aleatorio = new Random();
       // int parada = 0;
      //  for (Produto produto : produtos){
       //parada++;
           // int id = aleatorio.nextInt(6);
           // System.out.println(produto.getIdProduto(id)+ produto.toString());
          //  if (parada == 5){
          //      break;
          //  }

        Random aleatorio = new Random();
        Set<Integer> indicesUsados = new HashSet<>();

        while (indicesUsados.size() < 5 && indicesUsados.size() < produtos.size()) {
            int index = aleatorio.nextInt(produtos.size());

            if (!indicesUsados.contains(index)) {
                indicesUsados.add(index);
                Produto produto = produtos.get(index);
                System.out.println(produto);
            }
        }
    }

    }



