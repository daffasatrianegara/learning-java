import java.util.Scanner;

public class ha {
    public static void main(String[] args){
        Scanner angka = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int x = angka.nextInt();

        if (x % 2 == 0) {

        } else {
            for (int i = 1; i <= x; i++) {
                if (i % 2 == 1) {
                    for (int a = 1; a < (i / 2) + 1; a++) {
                        System.out.print(" ");
                    }
                    for (int b = i; b <= x; b++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
