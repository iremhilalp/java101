import java.util.Scanner;

public class ucgenuzunkenar  {
    public static void main(String[] args) {
        int kenar1 ,kenar2;
        double kenar3,x, alan, çevre;

        Scanner inp= new Scanner(System.in);

        System.out.print("1. kenarın uzunluğunu giriniz : ");
        kenar1 = inp.nextInt();
        System.out.print("2. kenarın uzunluğunu giriniz : ");
        kenar2 = inp.nextInt();
        System.out.print("3. kenarın uzunluğunu giriniz : ");
        kenar3 = inp.nextDouble();


        x= (kenar1+kenar2+kenar3) /2 ;
        çevre= 2*x;

        alan = Math.sqrt((x*((x-kenar1)*(x-kenar2)*(x-kenar3))));
        System.out.print("Üçgenin Alanı:" +alan);







    }
}
