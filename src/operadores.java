import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        int a,b,c,i;
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese el valor de a");
        a= lectura.nextInt();
        System.out.println("ingrese el valor de b");
        b= lectura.nextInt();
        System.out.println("ingrese el valor de c");
        c= lectura.nextInt();
        i=1;
        a= a+(++i);
        System.out.println("el valor de a es "+a);
        a= a+(i++);
        System.out.println("el valor de a es "+a);
        b= b+(--i);
        System.out.println("el valor de b es "+b);
        c= c+(i--);
        System.out.println("el valor de c es "+c);
    }
}
