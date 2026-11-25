import java.util.Scanner;
public class menuCompra {

    public static void menu() {
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
            //case 1 -> adicionarSacola();
            //case 2 -> listarProdutos();
            //case 3 -> removerProduto();
            //case 4 -> finalizarCompra();
            case 0 -> Voltar();
            default -> Voltar();
    }
}

 public static void Voltar() {
    System.out.println("Voltando ao menu principal...");
    return;
}
}