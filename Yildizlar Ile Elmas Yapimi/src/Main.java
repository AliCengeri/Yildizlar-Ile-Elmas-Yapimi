import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int bas2, bas = input.nextInt();
        bas2 = bas;
        for (int i = 1; i <= bas2 - 1; i++) {
            for (int i2 = 1; i2 <= (bas2 - i); i2++) {
                System.out.print(" ");
            }
            for (int i3 = 1; i3 <= (2 * i) - 1; i3++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = bas2; j > 0; j--) {
            for (int j3 = 0; j3 < (bas2 - j); j3++) {
                System.out.print(" ");
            }
            for (int j2 = (2 * j) - 1; j2 > 0; j2--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}