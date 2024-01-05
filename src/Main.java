import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        //double number = (int) (Math.random() * 100);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        int i = 0;
        System.out.println(number);


        while (right < 5) {
            System.out.println("Lütfen Tahmininizi Giriniz: ");
            selected = inp.nextInt();


            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen Bir 0-100 Arasında Bir Değer Giriniz.");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Hatalı giriş sonucu canınız azalacaktır");

                } else {
                    System.out.println("Çok Fazla Hatalı Giriş Yaptınız. Kalan Hakkınız: " + (5 - (++right)));
                }
                continue;
            }


            if (selected == number) {
                System.out.println("Tebrikler Doğru Tahmin. Tahmin Ettiğiniz Sayı: " + number);
                isWin = true;
                break;
            } else {

                System.out.println("Hatalı Bir Sayı Girdiniz");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür. ;)");

                } else {
                    System.out.println(selected + " say, gizli sayıdan küçüktür");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan Hakkınız: " + (5 - right));
            }

        }

        if (!isWin ) {
            System.out.println("Kaybettiniz! ");
        }
        System.out.println("Tahminleriniz: " + Arrays.toString(wrong));

    }
}