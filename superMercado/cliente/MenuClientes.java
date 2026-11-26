/* 
    Menu Clientes e Menu Produtos tem, basicamente falando, os mesmos métodos, só mudando o contexto 
*/
import java.util.Scanner;

public class MenuClientes {
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de Clientes:");
        System.out.println("================================");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("0. Voltar ao Menu Principal");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> new CadastrarClientes().menu();
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