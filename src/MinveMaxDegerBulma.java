import java.util.Scanner;
public class MinveMaxDegerBulma {
    public static void main(String[] args) {
        int value, tempDeger=0,tempDeger1=0;
        boolean isUser = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        value = input.nextInt();
        while(value<0){
            System.out.println("Sayı adedi negatif olamaz!!! ");
            System.out.print("Kaç tane sayı gireceksiniz: ");
            value = input.nextInt();
        }
        switch(value){
            case 0:
                System.out.print("Sayı adeti 0 olarak seçildi.İyi günler... :/");
                break;
            case 1:
                System.out.print("1. sayıyı giriniz: ");
                tempDeger=input.nextInt();
                System.out.print("En büyük sayı: "+tempDeger+"\nEn küçük sayı:"+tempDeger);
                break;
            case 2:
                System.out.print("1. sayıyı giriniz: ");
                tempDeger=input.nextInt();
                System.out.print("2. sayıyı giriniz: ");
                tempDeger1=input.nextInt();
                if(tempDeger<tempDeger1){
                    System.out.print("En büyük sayı: "+tempDeger1+"\nEn küçük sayı:"+tempDeger);
                }else{
                    System.out.print("En büyük sayı: "+tempDeger+"\nEn küçük sayı:"+tempDeger1);
                }
                break;
        }
        if(value>2) {

            System.out.print("1. sayıyı giriniz: ");
            int sayi = input.nextInt();
            System.out.print("2. sayıyı giriniz: ");
            int sayi1 = input.nextInt();
            if (sayi > sayi1) {
                for (int i = 3; i <= value; i++) {
                    System.out.print(i + ". sayıyı giriniz:");
                    tempDeger = input.nextInt();
                    if (sayi < tempDeger) {
                        sayi = tempDeger;
                    }
                    if (sayi1 > tempDeger) {
                        sayi1 = tempDeger;
                        }
                }
                System.out.print("En büyük sayı: "+sayi+"\nEn küçük sayı:"+sayi1);
            } else {
                for (int i = 3; i <= value; i++) {
                    System.out.print(i + ". sayıyı giriniz:");
                    tempDeger = input.nextInt();
                    if (sayi > tempDeger) {
                        sayi = tempDeger;
                    }
                    if (sayi1 < tempDeger) {
                        sayi1 = tempDeger;
                    }
                }
                System.out.print("En büyük sayı: "+sayi1+"\nEn küçük sayı:"+sayi);
            }
        }
    }
}
