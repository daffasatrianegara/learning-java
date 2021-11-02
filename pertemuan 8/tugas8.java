import java.util.Scanner;

class Tugas8 {
    public static void main(String[] args) {
        String[] nama = new String[1000];
        double[] ipk = new double[1000];
        String[] exit = {"exit", "Exit"};
        int i;
        double total = 0;
        for (i = 1; i <= 1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Data " + i + " : ");
            System.out.print("Nama Mahasiswa = ");
            String namadata = scan.nextLine();
            if (namadata.equals(exit[0]) || namadata.equals(exit[1])) {
                break;
            } else {
                nama[i] = namadata;
            }
            System.out.print("IPK Mahasiswa = ");
            double ipkdata = scan.nextDouble();
            ipk[i] = ipkdata;
            System.out.println();
            total = total + ipk[i];
        }
            System.out.println("NO   Nama      IPK      ");
            System.out.println("------------------------");
        for (int j = 1; j < i; j++) {
            System.out.println(j + "   " + nama[j] + "      " + ipk[j] + "      ");
        }
        System.out.println("------------------------");
        System.out.println("Rata - rata = " + total / (i - 1));
    }
}
