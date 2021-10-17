import java.util.Scanner;

public class p {
    public static void main(String[] args){
        Scanner yo = new Scanner(System.in);
        System.out.print("masukkan nomor : ");
        int a = yo.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
