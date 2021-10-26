import java.util.Scanner;

public class tugas8 {
    public static void main(String[] args) {
        String[] nama = new String[1000];
        double[] ipk = new double[1000];
        for (int i = 1; i <= 1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("memasukkan data");
            System.out.println("Data " + i);
            System.out.print("masukkan nama anda : ");
            nama[i] = scan.nextLine();
            if (name == i) {
                break;
            } else {
                nama[i] = nama;
            }
            System.out.print("masukkan IPK anda : ");
            ipk[i] = scan.nextDouble();
        }
    }
}
