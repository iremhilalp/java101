import java.util.Scanner;

public class ödevvücut {
    public static void main(String[] args) {
        double boy,kilo ,indeks ;

        Scanner input= new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.println("kilonuzu giriniz: ");
        kilo = input.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("vücut kitle indeksiniz :" + indeks );



    }
}
