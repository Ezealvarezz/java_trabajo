import javax.swing.*;

public class operadoresSwing {
    public static void main(String[] args) {
        String nombre;
        int numero1, numero2;
        double numero3;
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero 2"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero 3"));
        System.out.println("su nombre es "+nombre);
        System.out.println("el numero 1 es "+numero1);
        System.out.println("el numero 2 es "+numero2);
        System.out.println("el numero 3 es "+numero3);
        numero3+=numero1;
        System.out.println("el numero 3 es "+numero3);
        JOptionPane.showMessageDialog(null,"el valor de numero 1 es "+numero1);
    }
}
