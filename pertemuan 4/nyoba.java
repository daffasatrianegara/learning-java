import java.util.Scanner;

public class nyoba {
    public static void main(String[] args){
        Scanner ehe = new Scanner(System.in);

        System.out.println("nama mu siapa : ");
        String namaDepan = ehe.nextLine();
        System.out.println("kamu kuliah di mana : ");
        String tempat = ehe.nextLine();
        System.out.println("kamu jurusan apa : ");
        String jurusan = ehe.nextLine();

        System.out.println("namaku adalah " + namaDepan);
        System.out.println("aku kuliah di " + tempat);
        System.out.println("di jurusan " + jurusan);
    }
}

