import java.util.Scanner;


public class tugas2 {
    public static void main(String[] args){
    Scanner yahah = new Scanner(System.in);

    System.out.print("masukkan nilai A : ");
    int a = yahah.nextInt();
    System.out.print("masukkan nilai B : ");
    int b = yahah.nextInt();
    int hasil = a + b;
    System.out.println("hasil A + B adalah : " + hasil);
    hasil = a - b;
    System.out.println("hasil A - B adalah : " + hasil);
    hasil = a * b;
    System.out.println("hasil A x B adalah : " + hasil);
    hasil = a / b;
    System.out.println("hasil A : B adalah : " + hasil);
    hasil = a % b;
    System.out.println("hasil modulus A dan B adalah : " + hasil);

    }
}

