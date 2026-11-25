import java.util.Scanner;
public class menuCliente {

     public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de Clientes:");
        System.out.println("================================");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("0. Voltar ao Menu Principal");


        int opcao = sc.nextInt();

        switch (opcao) {
            //case 1 -> cadastrarCliente();
            case 0 -> Voltar();
            default -> Voltar();
    }
}

public static void Voltar() {
    System.out.println("Voltando ao menu principal...");
    return;
}

}
     
    //nn lembro como cria o bagulho la de atributo e talz ent vou deixar só o basico do menu msm

