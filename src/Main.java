import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int abrePainel = Integer.parseInt(JOptionPane.showInputDialog("Bem-vindo ás Eleições 2024! \n \n Digite 1 - Para votar como Eleitor\n Digite 2 - Para acessar votos como Mesário!"));
        if(abrePainel == 1){
            int votar = Integer.parseInt(JOptionPane.showInputDialog(""));
        }
    }
}