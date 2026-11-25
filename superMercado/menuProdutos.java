import java.util.Scanner;
public class menuProdutos {
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lista de Produtos Disponíveis:");
        System.out.println("================================");
        /*for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + ". " + produtos[i]);
        }*/

        System.out.println("Pressione enter para voltar ao menu principal...");
        sc.next();
        return;
    }
}
