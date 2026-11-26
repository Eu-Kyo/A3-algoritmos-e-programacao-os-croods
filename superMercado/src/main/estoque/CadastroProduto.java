package src.main.estoque;
import java.util.Scanner;

import src.main.Screen;

public class CadastroProduto {
    ListaProdutos listaProd;

    public CadastroProduto(){
        listaProd = new ListaProdutos();
        listaProd.carregarDados();
    }

    public void menu(){
        Screen.clear();
        System.out.println("====| CADASTRO DE PRODUTOS |====\n");
        System.out.println(" 1. Cadastrar Produtos\n 2. Listar Produtos\n 3. Buscar Produto");
        System.out.println(" 4. Alterar Produto\n 5. Remover Produto\n 0. Sair\n");
        Scanner sc = new Scanner(System.in);
        
        int op = sc.nextInt();

        switch (op) {
            case 0:
                return;
            case 1:
                listaProd.cadastrar();
                break;
            case 2:
                listar();
                break;
            case 3:
                // Pesquisar profuto pelo código
                System.out.println("> EM DESENVOLVIMENTO!! <");
                break;
            case 4:
                listaProd.alterar();
                break;
            case 5:
                listaProd.removerProduto();
                break;
        }
        menu();
    }

    public void listar(){
        listaProd.imprimir();
    }

}
