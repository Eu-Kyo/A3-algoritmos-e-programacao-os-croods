import java.util.Scanner;
public class menuProdutos {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lista de Produtos Disponíveis:");
        System.out.println("================================");
        /*for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + ". " + produtos[i]);
        }*/
       
            //nn sei se isso ta certp, mas minha inteção foi dps q vcs cadastrarem os produtos, ele pegar a quantidade q tem aí e mostrar todos

        System.out.println("Pressione enter para voltar ao menu principal...");
        sc.next();
        return;
    }
}
