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

    public void imprimirCod(){  // esse codProd é a posição do produto na lista, por enquanto ta dando erro
        //System.out.println("COD: "+ codProd + "\nID: "+ id + "\nNome: " + nome + "\n Preço: " + preco);
        System.out.println("ID: "+ id + "\nNome: " + nome + "\n Preço: " + preco);                      // ID = unico para o produto,útil pra parte de pesquisa de produtos
    }
}
