package src.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Screen.clear(); 
        Main sistema = new Main();
        sistema.exibirMenu();
    }

    public void exibirMenu() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirMenu();
       
    }
}