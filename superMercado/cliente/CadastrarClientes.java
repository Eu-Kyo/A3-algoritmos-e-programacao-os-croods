import java.util.Scanner;
public class CadastrarClientes {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    public int opcao;
    public void menu() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        Scanner sc = new Scanner(System.in);
        System.out.println("====| Menu de Cadastro de Clientes |====");
        System.out.println("========================================");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Checar Informação Própria");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");

    do {
        int opcao = sc.nextInt();
        sc.nextLine();

    switch (opcao) {
        case 1 -> cadastrarCliente();
        case 2 -> checarInformacaoPropria();
        case 3 -> menuPrincipal.exibirMenu();
        default -> System.out.println("Opção inválida.");
    }
} while (opcao != 3);
    }

    private void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        this.nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        this.cpf = sc.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        this.telefone = sc.nextLine();
        System.out.print("Digite o email do cliente: ");
        this.email = sc.nextLine();

        System.out.println("Cliente cadastrado com sucesso!");
        menu();
    }
    private void checarInformacaoPropria() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual informação você deseja checar?");
            System.out.println("1. Nome");
            System.out.println("2. CPF");
            System.out.println("3. Telefone");
            System.out.println("4. Email");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch (opcao) {
            case 1 -> System.out.println("Nome: " +this.nome);
            case 2 -> System.out.println("CPF: " + this.cpf);
            case 3 -> System.out.println("Telefone: " + this.telefone);
            case 4 -> System.out.println("Email: " + this.email);
            case 5 -> menuPrincipal.exibirMenu();
            default -> System.out.println("Opção inválida.");
        }
        }
        while (opcao < 1 || opcao > 5);
    }
}
