import java.util.Scanner;

public class dairealanvecevre {
    public static void main(String[] args) {
        int r;
        double pi=3.14;


        Scanner input= new Scanner(System.in);
        System.out.print("daireinin yarıçapını girin: ");
        r = input.nextInt();
        double alan=pi * r * r, cevre=2*pi*r;

        System.out.println("dairenin alanı =" + alan);
        System.out.println("dairenin çevresi: " + cevre);

        int acı;
        System.out.print("dilimin acısını girin: ");
        acı = input.nextInt();

        double acınınalanı = alan*acı/360;
        System.out.println("Daire diliminin alanı: "+ acınınalanı);


    }


}
