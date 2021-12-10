import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yas, km, ytipi;
        double perkm = 0.10, total, yasInd, tipInd;


        System.out.println("Mesafeyi km cinsinden giriniz :");
        km = input.nextInt();


        System.out.println("Yaşınızı giriniz :");
        yas = input.nextInt();


        System.out.println("Yolculuk seçiminizi yapınız \n 1-Tek yön \n 2-Gidiş-Dönüş");
        ytipi = input.nextInt();


        if (!(yas > 0 && km > 0 && (ytipi == 1 || ytipi == 2))) {

            System.out.println("Hatalı giriş yaptınız!");
        } else {

            total = km * perkm;

            if (yas < 12) {
                total = total * 0.5;

            } else if (yas > 12 && yas < 24) {
                yasInd = total * 0.10;
                total -= yasInd;

            } else if (yas > 65) {
                yasInd = total * 0.3;
                total -= yasInd;
            }

            if (ytipi == 2) {
                tipInd = total * 0.20;
                total = 2 * (total - tipInd);
            }

            System.out.println("Bilet ücretiniz :" + total);
        }
    }
}
