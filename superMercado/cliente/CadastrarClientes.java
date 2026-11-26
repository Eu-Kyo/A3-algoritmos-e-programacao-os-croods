import java.util.Scanner;
public class CadastrarClientes {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    public void menu() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        Scanner sc = new Scanner(System.in);
        System.out.println("====| Menu de Cadastro de Clientes |====");
        System.out.println("========================================");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Checar Informação Própria");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1 -> cadastrarCliente();
            case 2 -> checarInformacaoPropria();
            case 3 -> menuPrincipal.exibirMenu();
        }
    }

    private void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = sc.nextLine();

        System.out.println("Cliente cadastrado com sucesso!");
    }
    private void checarInformacaoPropria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual informação você deseja checar?");
        System.out.println("1. Nome");
        System.out.println("2. CPF");
        System.out.println("3. Telefone");
        System.out.println("4. Email");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1 -> System.out.println("Nome: " +nome);
            case 2 -> System.out.println("CPF: " + cpf);
            case 3 -> System.out.println("Telefone: " + telefone);
            case 4 -> System.out.println("Email: " + email);
            default -> System.out.println("Opção inválida.");
        }
    }
}
