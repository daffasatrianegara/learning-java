class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private double ipk;
    private  int semester;

    public Mahasiswa(String nim,int semester, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setSem(int semester) {
        this.semester = semester;
    }

    public int getSem() {
        return this.semester;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void getDetail() {
        System.out.println(this.semester+"\t\t"+this.nim+"\t\t"+this.nama+"\t\t"+this.ipk+"\t"+this.tinggiBadan);
    }

}