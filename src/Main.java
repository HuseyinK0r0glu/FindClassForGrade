import java.util.*;

public class Main {
    public static void main(String[] args) {

        int turkce,matematik,fenbilgisi,sosyalbilgisi,bedenegitimi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Türkçe Notunu Giriniz :");
        turkce = scan.nextInt();
        System.out.println("Matematik Notunu Giriniz :");
        matematik = scan.nextInt();
        System.out.println("Fen Bilgisi Notunu Giriniz :");
        fenbilgisi = scan.nextInt();
        System.out.println("Sosyal Bilgiler Notunu Giriniz :");
        sosyalbilgisi = scan.nextInt();
        System.out.println("Beden Eğitmi Notunu Giriniz :");
        bedenegitimi = scan.nextInt();
        int sonuc ;
        sonuc = turkce+matematik+fenbilgisi+sosyalbilgisi+bedenegitimi;
        double ortalama;
        ortalama = sonuc/5;

        if(ortalama>=50){
            System.out.println(ortalama + "\nSınıfı Geçtiniz");
        }
        else{
            System.out.println(ortalama + "\nSınıfta Kaldınız");
        }
    }
}