import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        int edad;
        String examenVisual="OK";
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese su edad");
        edad = lectura.nextInt();
        if (edad>18 && examenVisual.equals("OK")){
            System.out.println("Habilitado para sacar el carnet");
        }
        else
            System.out.println("no habilitado para sacarlo");
    }
}
