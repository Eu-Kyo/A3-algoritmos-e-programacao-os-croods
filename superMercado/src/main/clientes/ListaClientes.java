package src.main.clientes;


/* 
    Lista Clientes e Lista Produtos tem, basicamente falando, os mesmos métodos, só mudando o contexto 
*/
public class ListaClientes {
    public Cliente lista[];
    public int qntd;

    public ListaClientes(){
        lista = new Cliente[100];
        qntd = 0;
    }

    public void remover(){
        System.out.println("Tchau usuário");
    }
    
}
