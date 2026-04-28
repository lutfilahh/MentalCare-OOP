public class Konseling {
    String nama;
    String email;

    public Konseling(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Email : " + email);
    }  
}

class konselor extends Konseling {
    String spesalis;

    public konselor(String nama, String email, String spesalis) {
        super(nama, email);
        this.spesalis = spesalis;
    }

    public String getSpesalis(){
        return spesalis;
    }

    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Spesalis : " + spesalis);
    }

}

class klien extends Konseling {
    String keluhan;

    public klien(String nama, String email, String keluhan) {
        super(nama, email);
        this.keluhan = keluhan;
    }

    public String getKeluhan(){
        return keluhan;
    }

    public void tampilaninfo(){
        super.tampilkanInfo();
        System.out.println("Keluhan : " + keluhan);
    }
}

class SesiKonseling {
    konselor konselor;
    klien klien;
    String tanggal;
    boolean status;

    public SesiKonseling(konselor konselor, klien klien, String tanggal, boolean status){
        this.konselor = konselor;
        this.klien = klien;
        this.tanggal = tanggal;
        this.status = status;
    }

    public void MulaiSesi() {
        System.out.println("\n"+"========= Sesi Konseling =========");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Konselor : " + konselor.getNama());
        System.out.println("Klien : " + klien.getNama());
        System.out.println("Keluhan : " + klien.getKeluhan());
        System.out.println("Status Sesi : " + (status ? "Selesai" : "Belum Selesai" + "\n"));
    }

}

class Main {
    public static void main(String[] args) {
        konselor konselor1 = new konselor("Dr Boyke", "boyke123@gmail.com","Alat kelamin");
        klien klien1 = new klien("Aryo" ,"aryo@gmail.com" ,"Tekanan karena bermain mobile legends");
        SesiKonseling sesi1 = new SesiKonseling(konselor1, klien1, "24 Februauri 2006", false);

        System.out.println("--------------------");
        konselor1.tampilkanInfo();
        System.out.println("--------------------");
        klien1.tampilaninfo();
        System.out.println("--------------------");
        sesi1.MulaiSesi();
    }
}
