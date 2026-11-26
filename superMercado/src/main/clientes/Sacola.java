package src.main.clientes;
/*  
    Classe pra separar o controle do Estoque (admin) com o controle da Sacola(cliente)
*/
import java.util.Scanner;

import src.main.Screen;
import src.main.estoque.ListaProdutos;
import src.main.estoque.Produto;

public class Sacola {
    //static String prods[];
    public Produto sacola[];
    static int qntd;
    
    public Sacola(){
        sacola = new Produto[1000];
        qntd = 0;
    }

    public void adicionar(){
        Screen.clear();
        ListaProdutos listaProd = new ListaProdutos();
        Scanner sc = new Scanner(System.in);
        int cod;

        do{
            listaProd.imprimir();
            System.out.println("> Qual produto deseja adicionar na sacola? (Código)");
            System.out.println("==================================================="); 
            cod = sc.nextInt();
            sc.nextLine();      // buffer wow   
            
        }
        while(cod != 0);
    }
    
    public void imprimir(){}

    public void remover(){}

    public void salvar(){}      // salvar e finalizar são os mesmos?

    public void finalizar(){}
}
