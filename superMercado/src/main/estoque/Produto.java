package src.main.estoque;
public class Produto {
    String nome;
    double preco;
    int id;

    public Produto(){}

    public Produto(String nome, double preco, int id){
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
        public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimir(int codProd){  // esse codProd é a posição do produto na lista, por enquanto ta dando erro
        System.out.println("ID: "+ id + " | Nome: " + nome + " | Preço:" + preco);                      // ID = unico para o produto,útil pra parte de pesquisa de produtos
    }
}
