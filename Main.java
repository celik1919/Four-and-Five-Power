import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner mec = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = mec.nextInt();

        System.out.println("4'ün Kuvvetleri: ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("5'in Kuvvetleri: ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}