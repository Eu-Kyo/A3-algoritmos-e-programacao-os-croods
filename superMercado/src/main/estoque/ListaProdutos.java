package src.main.estoque;
import src.main.administracao.AcessarMenuAdmin;
/* 
    Lista Clientes e Lista Produtos tem, basicamente falando, os mesmos métodos, só mudando o contexto 
*/
import java.util.Scanner;

import src.main.CsvUtil;
import src.main.MenuPrincipal;
import src.main.Screen;

public class ListaProdutos{
    public Produto lista[];
    public int qntd;    

    public ListaProdutos(){
        lista = new Produto[100];
        qntd = 0;
        carregarDados();
    }

    public void cadastrar(){        // Cadastra o produto pelo código, depois o adicionando à lista
        carregarDados();
        Screen.clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("====| CADASTRO DE PRODUTOS |====");
        System.out.println("- - - - - - - - - - - - - - - -");
        System.out.println("> Qual o nome do Produto?");
        String nome = sc.nextLine();
        System.out.println("> Qual o preço do Produto?");
        Double preco = sc.nextDouble();
        System.out.println("> Qual o ID unico do Produto?");
        int id = sc.nextInt();

        Produto p = new Produto(nome, preco, id);    
        adicionar(p);
        salvar();
    } 

    public void adicionar(Produto p){        // Adiciona o produto à lista de produtos(ADM)
        lista[qntd] = p;
        qntd++;
    }

    public void alterar(){}

    public void remover(){          // Interação com usuário para escolher o produto a ser removido
        System.out.println("Tchau Produto");
        AcessarMenuAdmin menuAdmin = new AcessarMenuAdmin();        // o certo é não precisar de senha, vou resolver isso depois
        menuAdmin.AdmMenu();

    }

    public void removerProduto(){   // Depois da escolhe do produto, ele é removido da lista

    }
    public void imprimir(){
        carregarDados();                // Carregar os dados antes de chamar qualquer método relacionado com a lista, senão mostra a lista desatualizada
        Screen.clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("=====| PRODUTOS EM ESTOQUE |=====");
        for(int i = 0; i < qntd; i++){
            lista[i].imprimir(i);
        }
        System.out.println("Digite (0) para sair");
        int opcao = sc.nextInt();
        if (opcao == 0) {
            new MenuPrincipal().exibirMenu();
        }
        
    }

    public void buscar(){
        System.out.println("> ERRO: Função não implementada no momento!");
    }

    public void salvar(){
        Produto prods[] = new Produto[qntd];
        for(int i = 0; i < qntd; i++){
            prods[i] = lista[i];
        }
        CsvUtil.salvar(prods, "./superMercado/src/main/csv/listaProdutos.csv");
    }

    public void carregarDados(){
        Produto[] prods = CsvUtil.ler("./superMercado/src/main/csv/listaProdutos.csv", Produto.class);
        for(int i = 0; i < prods.length; i++){
            lista[i] = prods[i];
        }
        qntd = prods.length;
    }
}