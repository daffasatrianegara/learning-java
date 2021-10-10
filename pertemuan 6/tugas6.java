import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan nilai bilangan maksimal yang akan di tampilkan : ");
        int n = a.nextInt();
        int i = 0;
        int angka = 0;
        while (i != n){
            if (i == Math.pow(5, angka)){
                System.out.println(i);
                angka++;

            }
            i++;
        }
    }
}
