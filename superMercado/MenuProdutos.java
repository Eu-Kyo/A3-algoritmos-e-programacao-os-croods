/* 
    Menu Clientes e Menu Produtos tem, basicamente falando, os mesmos métodos, só mudando o contexto 
*/
import java.util.Scanner;

public class MenuProdutos {
    public static void menu() {
        ListaProdutos listaProd = new ListaProdutos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de Produtos:");
        System.out.println("================================");
        System.out.println("1. Adicionar na Sacola");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Remover Produto");
        System.out.println("4. Finalizar a Compra");
        System.out.println("0. Voltar ao Menu Principal");
            
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> listaProd.adicionar();
            case 2 -> listaProd.imprimir();
            case 3 -> listaProd.buscar();       // Não implementado
            case 4 -> listaProd.remover();
            case 5 -> listaProd.salvar();
            case 0 -> Voltar();
            default -> Voltar();
    }
}

 public static void Voltar() {
    System.out.println("Voltando ao menu principal...");
    return;
}
}