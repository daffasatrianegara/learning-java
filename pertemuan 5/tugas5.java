import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args){
        Scanner IPK = new Scanner(System.in);        
            System.out.print("berapakah IPK anda : " );
            double ipk = IPK.nextDouble();
            System.out.print("berapa tahun anda menempuh masa kuliah anda sampai lulus : " );
            int masa = IPK.nextInt();

            if (ipk >= 3.51 && ipk <= 4.00 && masa <= 4 && masa > 2) {
            System.out.println("anda mendapatkan predikat summa cumlaude");
            } else if (ipk >= 3.51 && ipk <= 4.00 && masa > 4){
                System.out.println("anda mendapatkan predikat cumlaude");
            } else if (ipk >= 3.01 && masa >=3 && ipk <= 4.00){
                System.out.println("anda mendapatkan predikat sangat memuaskan");
            } else if (ipk >= 2.76 && masa >= 3 && ipk <= 4.00){
                System.out.println("anda mendapatkan predikat memuaskan");
            } else if (ipk >= 2.00 && masa >=3 && ipk <= 4.00){
                System.out.println("anda mendapatkan predikat cukup");
            } else if (ipk < 2.00 && masa >=3 && ipk <= 4.00){
                System.out.println("mohon maaf, anda tidak lulus");
            } else {
                System.out.println("mohon maaf, data yang anda masukkan salah");
            }
        }
    }

