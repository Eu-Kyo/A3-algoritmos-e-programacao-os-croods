import java.util.Scanner;
public class AcessarMenuAdmin {
    public void AdmMenu() {
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
                //case 1 -> cadastrarProduto();
                //case 2 -> removerProduto();
                //case 3 -> removerCliente();
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
