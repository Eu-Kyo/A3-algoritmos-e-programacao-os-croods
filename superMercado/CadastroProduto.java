import java.util.Scanner;

public class CadastroProduto {
    ListaProdutos listaProd;

    public CadastroProduto(){
        listaProd = new ListaProdutos();
        listaProd.carregarDados();
    }

    public void menu(){
        Screen.clear();
        System.out.println("====| CADASTRO DE PRODUTOS |====\n");
        System.out.println(" (1) Cadastrar Produtos\n (2) Listar Produtos\n (3) Buscar Produto");
        System.out.println(" (4) Alterar Produto\n (5) Remover Produto\n (0) Sair\n");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if(op == 0){
            return;
        }
        if (op == 1) {
            listaProd.cadastrar();
        }
        if (op == 2) {
            listar();
        }
        if (op == 3) {
            // Pesquisar profuto pelo código
            System.out.println("> EM DESENVOLVIMENTO!! <");
        }
        if (op == 4) {
            listaProd.alterar();
        }
        if (op == 5) {
            listaProd.removerProduto();
        }
        menu();
    }

    public void listar(){
        listaProd.imprimir();
    }

}
