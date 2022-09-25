import  java.util.Scanner;
public class taksimetre {

    public static void main(String[] args) {
        int km;
        double perkm=2.20, total, starPrice=10 ;
        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();

        total= (km*perkm);
        total += starPrice;

        total= (total < 20) ? 20 : total;
        System.out.println("toplam tutar : "+ total);

    }
}
