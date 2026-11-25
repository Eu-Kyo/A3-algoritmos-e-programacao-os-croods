import java.util.Scanner;

public class SistemaDoMercado {

    public static void main(String[] args) {
        Screen.clear(); 
        SistemaDoMercado sistema = new SistemaDoMercado();
        sistema.exibirMenu();
    }

    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        acessarMenuAdmin acessarMenuAdmin = new acessarMenuAdmin();

        
        do {
            System.out.println(" Menu Principal:");
            System.out.println("================================");
            System.out.println("1. Menu de Produtos");
            System.out.println("2. Menu do Cliente");
            System.out.println("3. Realizar Compra");
            System.out.println("4. Menu Admin");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");
            
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1 -> menuProdutos.menu();
                case 2 -> menuCliente.menu();
                case 3 -> menuCompra.menu();
                case 4 -> acessarMenuAdmin.AdmMenu();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            
        } while (opcao != 0);
        sc.close();
    }
}