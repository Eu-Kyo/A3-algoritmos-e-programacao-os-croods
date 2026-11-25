import java.util.Scanner;

public class SistemaDoMercado {

    public static void main(String[] args) {
        Screen.clear(); 
        SistemaDoMercado sistema = new SistemaDoMercado();
        sistema.exibirMenu();
    }

    public void exibirMenu() {
        //Scanner sc = new Scanner(System.in);
        //int opcao;
        // AcessarMenuAdmin acessarMenuAdmin = new AcessarMenuAdmin();
        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirMenu();
        
        // do {
        //     System.out.println(" Menu:");
        //     System.out.println("================================");
        //     System.out.println("1. Produtos");
        //     System.out.println("2. Clientes");
        //     System.out.println("3. Realizar Compra");
        //     System.out.println("4. Controle de Estoque");
        //     System.out.println("5. Acessar Menu Admin");
        //     System.out.println("6. Sair");
        //     System.out.println("Escolha uma opção:");
            
        //     opcao = sc.nextInt();
        //     sc.nextLine();
            
        //     switch (opcao) {
        //         //case 1 -> adicionarSacola();
        //         //case 2 -> listarProdutos();
        //         //case 3 -> removerProduto();
        //         //case 4 -> CadastroProduto.menu();
        //         case 5 -> acessarMenuAdmin.acessarMenuAdmin();
        //         case 6 -> System.out.println("Saindo do sistema...");
        //         default -> System.out.println("Opção inválida. Tente novamente.");
        //     }
            
        // } while (opcao != 6);
        // sc.close();
    }
}