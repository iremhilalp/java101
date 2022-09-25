import  java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {

        int  mat,fızık,turkce,kimya,tarih,muzik;

        Scanner inp= new Scanner(System.in);

        System.out.print("matematik notunuz: ");
        mat= inp.nextInt();

        System.out.print("fizik notunuz: ");
        fızık= inp.nextInt();

        System.out.print("türkçe notunuz: ");
        turkce= inp.nextInt();

        System.out.print("kimya notunuz: ");
        kimya= inp.nextInt();

        System.out.print("tarih notunuz: ");
        tarih= inp.nextInt();

        System.out.print("müzik notunuz: ");
        muzik= inp.nextInt();

        int toplam= (mat + fızık + kimya + turkce + tarih + muzik);
        double sonuc= toplam/6.0;
        System.out.println("Ortalamaınz = " + sonuc);

        String durum=(sonuc>=60) ? "geçtiniz" : "kaldınız" ;
        System.out.print("ders geçme durumu: " + durum);
    }



}
