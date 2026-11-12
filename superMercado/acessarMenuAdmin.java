import java.util.Scanner;
public class acessarMenuAdmin {
    public void acessarMenuAdmin() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite a senha de acesso: ");
        String senha = sc1.nextLine();
        System.out.println("Senha digitada: " + senha);
    
        if (senha.equals("6769")) {
            //cadastrarProduto();
        } 
            else {
        System.out.println("Senha incorreta. Voltando ao menu principal...");
    }
}   
    
}
