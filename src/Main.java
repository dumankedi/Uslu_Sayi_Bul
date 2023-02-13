import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2,sonuc=1;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        sayi1=input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        sayi2=input.nextInt();
        for (int i = 1; i <=sayi2 ; i++) {
            sonuc*=sayi1;
        }
        System.out.println(sonuc);
    }
}