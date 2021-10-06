import java.util.Scanner;

public class siakad {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in);

        System.out.println("selamat datang di SIAKAD");
        System.out.println("silahkan pilih menu berikut : ");
        System.out.println("1. tambah data");
        System.out.println("2. edit data");
        System.out.println("3. hapus data");
        System.out.println("4. lihat data");
        System.out.print("anda memilih : ");
        int pilih = data.nextInt();

        if ( pilih == 1){
            System.out.println("silahkan pilih menu berikut : ");
            System.out.println("1. Tambah data mahasiswa : ");            
            System.out.println("2. tambah data matakuliah : ");
            System.out.println("3. kembali");           
            System.out.print("anda memilih : ");
            int nama = data.nextInt();
            if (nama == 1){
                System.out.print("masukkan nama mahasiswa : "  );
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                System.out.println("mahasiswa yang anda tambahkan adalah : " + name);
            } else if (nama == 2){
                System.out.print("masukkan nama mata kuliah : ");
                Scanner kuliah = new Scanner(System.in);
                String matkul = kuliah.nextLine();
                System.out.println("mata kuliah yang anda tambah adalah : " + matkul);
            } else if (nama == 3){
                System.out.println("terima kasih");
            } else {
                System.out.println("menu tidak ada");
            } 
            
        }else if (pilih >= 2 && pilih <= 4){
              System.out.println("fitur belum ada");
        

        }else {
            System.out.println("menu tidak ada");
        }
        



    }
}

