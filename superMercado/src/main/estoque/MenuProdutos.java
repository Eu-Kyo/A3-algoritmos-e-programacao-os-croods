package src.main.estoque;
/* 
    Menu Clientes e Menu Produtos tem, basicamente falando, os mesmos métodos, só mudando o contexto 
*/
import java.util.Scanner;

import src.main.clientes.Sacola;

public class MenuProdutos {
    public static void menu() {
        ListaProdutos listaProd = new ListaProdutos();
        Sacola sacola = new Sacola();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de Produtos:");
        System.out.println("================================");
        System.out.println("1. Adicionar na Sacola");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Remover Produto");
        System.out.println("4. Finalizar a Compra");
        System.out.println("0. Voltar ao Menu Principal");
            
        int opcao = sc.nextInt();

        switch (opcao) {        // Acessar a Sacola
            case 1 -> sacola.adicionar();
            case 2 -> sacola.imprimir();
            case 3 -> sacola.remover();
            case 4 -> sacola.salvar();
            case 0 -> Voltar();
            default -> Voltar();
    }
}

 public static void Voltar() {
    System.out.println("Voltando ao menu principal...");
    return;
}
}