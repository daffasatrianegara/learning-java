import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = scan.nextInt();

        if (angka % 2 == 0) {
            for (int a = 1; a <= angka; a++){
                for (int b = 1; b <= a; b++){
                    System.out.print("*");
                }
                System.out.println();
            }

        } else {
            for (int i=1; i <= angka; i++){
                for (int j= angka; j >= 1; j--){
                    if (j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}


