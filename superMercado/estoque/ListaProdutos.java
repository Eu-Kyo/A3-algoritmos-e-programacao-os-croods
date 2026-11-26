/* 
    Lista Clientes e Lista Produtos tem, basicamente falando, os mesmos métodos, só mudando o contexto 
*/
import java.util.Scanner;

public class ListaProdutos{
    //public String prods[] = {"Arroz", "Feijão", "Macarrão", "Limão"};
    public Produto lista[];
    public int qntd = 4;    

    public ListaProdutos(){
        lista = new Produto[100];
        qntd = 0;
    }

    public void cadastrar(){        // Cadastra o produto pelo código, depois o adicionando à lista
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

    }

    public void removerProduto(){   // Depois da escolhe do produto, ele é removido da lista

    }
    public void imprimir(){
        Screen.clear();
        System.out.println("=====| PRODUTOS EM ESTOQUE |=====\n");
        for(int i = 0; i < qntd; i++){
            lista[i].imprimir(i);
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
        CsvUtil.salvar(prods, "./superMercado/estoque/listaProdutos.csv");
    }

    public void carregarDados(){}
}