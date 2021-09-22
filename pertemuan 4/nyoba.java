import java.util.Scanner;

public class nyoba {
    public static void main(String[] args){
        Scanner ehe = new Scanner(System.in);

        System.out.println("nama mu siapa : ");
        String namaDepan = ehe.nextLine();
        System.out.println("kamu kuliah di mana : ");
        String tempat = ehe.nextLine();
        System.out.println("kamu jurusan apa cok : ");
        String jurusan = ehe.nextLine();

        System.out.println("nama i adalah " + namaDepan);
        System.out.println("i kuliah di " + tempat);
        System.out.println("i jurusan " + jurusan);
    }
}

