import java.util.Scanner;

public class odevmanav {
    public static void main(String[] args) {

        double toplamtutar, armutf=2.14,armut ,elmaf=3.67,elma, domatesf=1.11,domates,muzf=0.95, muz, patlicanf=5.00,patlican;

        Scanner input= new Scanner(System.in);

        System.out.print("Kaç kilo Armut : ");
        armut = input.nextDouble();
        armut = armut * armutf;

        System.out.print("Kaç kilo Elma : ");
        elma = input.nextDouble();
        elma = elma * elmaf;

        System.out.print("Kaç kilo Domates : ");
        domates = input.nextDouble();
        domates = domates * domatesf;

        System.out.print("Kaç kilo Muz : ");
        muz = input.nextDouble();
        muz = muz * muzf;

        System.out.print("Kaç kilo Patlıcan : ");
        patlican = input.nextDouble();
        patlican = patlican * patlicanf;

        toplamtutar = (armut + elma + domates + muz + patlican);
        System.out.print("Toplam Tutar : " + toplamtutar + " TL");








    }
}
