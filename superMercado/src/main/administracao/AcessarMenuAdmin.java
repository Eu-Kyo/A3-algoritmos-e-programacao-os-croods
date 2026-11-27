package src.main.administracao;
import src.main.estoque.ListaProdutos;
import src.main.clientes.ListaClientes;
import java.util.Scanner;

public class AcessarMenuAdmin {
    public void AdmMenu() {
        ListaProdutos listaProd = new ListaProdutos();
        ListaClientes listaCli = new ListaClientes();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha de acesso: ");
        String senha = sc.nextLine();

        
        if (senha.equals("6769")) {
            System.out.println("Menu de admin:");
            System.out.println("================================");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Remover Cliente");
            System.out.println("0. Voltar");

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> listaProd.cadastrar();
                case 2 -> listaProd.remover();
                case 3 -> listaCli.remover();
                case 0 -> Voltar();
                default -> Voltar();
            }
        }
            else {
        System.out.println("Senha incorreta. Voltando ao menu principal...");
        return;
            }
        }

     public static void Voltar() {
        System.out.println("Voltando ao menu principal...");
        return;
    }
}
