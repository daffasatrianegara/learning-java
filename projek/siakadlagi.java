import java.util.Scanner;
class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=9) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.cariData();
            } else if (menu==4) {
                siakad.rerataIPK();
            } else if (menu==5) {
                siakad.editnama();
            } else if (menu==6) {
                siakad.hapusdata();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("+==============+");
        System.out.println("|    SIAKAD    |");
        System.out.println("+==============+");
        System.out.println("|1. Lihat Data |");
        System.out.println("|2. Tambah Data|");
        System.out.println("|3. Cari Data  |");
        System.out.println("|4. Rerata IPK |");
        System.out.println("|5. edit nama  |");
        System.out.println("|6. hapus data |");
        System.out.println("|9. keluar     |");
        System.out.println("+==============+");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        System.out.println();
        return menu;
        
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("     DATA MAHASISWA     ");
            System.out.println("anda belum memasukkan data");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("     DATA MAHASISWA     ");
            System.out.println("SEMESTER\t"+"NIM" + "\t\t"+ "NAMA" + "\t\t" + "IPK" + "\t" + "TINGGI BADAN");
            for (int i=0; i<jumlahData;i++) {
                mahasiswa[i].getDetail();
            }
            System.out.println();
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        Scanner sems = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("masukkan semester mahasiswa = ");
        int semester = sems.nextInt();
        System.out.print("Masukan nama mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukan IPK mahasiswa = ");
        double ipk = scan.nextDouble();
        System.out.print("Masukan Tinggi Badan mahasiswa = ");
        double tinggi = scan.nextDouble();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, semester, nama, ipk);
        inputMahasiswa.setTinggiBadan(tinggi);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void cariData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda cari tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
        }
    }
    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }


    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }
    


public void hapusdata() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
    String nim = scan.nextLine();
    int index = getIndexByNIM(nim);
    if (index==-1) {
        System.out.println("Data yang anda akan hapus tidak ketemu");
    } else {
        for (int i = index; i<jumlahData; i++) {
            mahasiswa[i] = mahasiswa[i+1];
        }
        jumlahData--;
        lihatData();
    }
}


public void editnama() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
    String nim = scan.nextLine();
    int index = getIndexByNIM(nim);
    if (index==-1) {
        System.out.println("NIM yang anda akan edit tidak ketemu");
    } else {
        System.out.println("berikut data mahasiswa yang akan di edit : ");
        mahasiswa[index].getDetail();
        System.out.println();
        System.out.print("Masukan Nama mahasiswa yang baru = ");
        String nama = scan.nextLine();
        System.out.println("berikut data mahasiswa yang berhasil di edit :");
        mahasiswa[index].setNama(nama);
        mahasiswa[index].getDetail();
        System.out.println();
    }
}
}

