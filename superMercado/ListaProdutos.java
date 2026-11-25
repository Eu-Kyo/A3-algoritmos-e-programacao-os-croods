/* 
    Lista Clientes e Lista Produtos tem, basicamente falando, os mesmos métodos, só mudando o contexto 
*/

public class ListaProdutos{
    public Produto lista[];
    public int qntd;

    public ListaProdutos(){
        lista = new Produto[100];
        qntd = 0;
    }

    public void cadastrar(){        // Cadastra o produto pelo código, depois o adicionando à lista

    } 

    public void adicionar(){        // Após o cadastro, é adicionado à lista

    }

    public void alterar(){}

    public void remover(){          // Interação com usuário para escolher o produto a ser removido

    }

    public void removerProduto(){   // Depois da escolhe do produto, ele é removido da lista

    }
    public void imprimir(){
        Screen.clear();
        System.out.println("Listar produtos");}

    public void buscar(){
        System.out.println("> ERRO: Função não implementada no momento!");
    }

    public void salvar(){}

    public void carregarDados(){}
}