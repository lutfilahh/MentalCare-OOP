public class KontenEdukasi {
    int idKonten;
    String judulKonten, jenisKonten;

    public KontenEdukasi(int idKonten, String judulKonten, String jenisKonten) {
        this.idKonten = idKonten;
        this.judulKonten = judulKonten;
        this.jenisKonten = jenisKonten;
    }
    
    public void tampilkanKonten(){
        System.out.println("ID Konten:" + idKonten);
        System.out.println("Judul Konten:" + judulKonten);
        System.out.println("Jenis Konten:" + jenisKonten);
    }

public class Main {
    public static void main(String[] args){
        KontenEdukasi konten1 = new KontenEdukasi(1, "Mengenal Kesehatan Mental", "Artikel");
        KontenEdukasi konten2 = new KontenEdukasi(2, "Tips Mengelola Stres", "Video");
        KontenEdukasi konten3 = new KontenEdukasi(3, "Pentingnya Tidur yang Cukup", "Infografis");
        konten1.tampilkanKonten();
        konten2.tampilkanKonten();
        konten3.tampilkanKonten();
    }
}
}
