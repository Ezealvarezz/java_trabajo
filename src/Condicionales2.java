import javax.swing.*;

public class Condicionales2 {
    public static void main(String[] args) {
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog("1-cafe con tortita\n 2-gaseosa\n Elija opcion"));
        switch (menu){
            case 1:
                JOptionPane.showMessageDialog(null, "son 100 pesos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "son 200 pesos");
                break;
            default:
                JOptionPane.showMessageDialog(null, "error");
                break;
        }
    }
}
