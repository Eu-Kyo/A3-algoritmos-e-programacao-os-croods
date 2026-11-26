import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal(){}

    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        AcessarMenuAdmin menuAdm = new AcessarMenuAdmin();
        CadastroProduto menuProd = new CadastroProduto();
        ListaProdutos listaProd = new ListaProdutos();
        MenuClientes menuCli = new MenuClientes();
        ListaClientes listaCli = new ListaClientes();

        do { 
            System.out.println("====| Menu Principal |====");
            System.out.println("================================");
            System.out.println("1. Ver Produtos");          // ListaProdutos
            System.out.println("2. Menu do Cliente");       // MenuClientes
            System.out.println("3. Realizar Compra");       // MenuProdutps
            System.out.println("4. Menu Admin");            // MenuADM
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1 -> listaProd.imprimir();
                case 2 -> menuCli.menu();
                case 3 -> menuProd.menu();
                case 4 -> menuAdm.AdmMenu();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            
        } while (opcao != 0);
        sc.close();
    }
}