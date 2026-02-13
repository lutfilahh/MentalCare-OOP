public class psikolog {
    int idPsikolog;
    String namaPsikolog, spesialisasi, email, nomorTelepon;
    
    public psikolog(int idPsikolog, String namaPsikolog, String spesialisasi, String email, String nomorTelepon) {
        this.idPsikolog = idPsikolog;
        this.namaPsikolog = namaPsikolog;
        this.spesialisasi = spesialisasi;
        this.email = email;
        this.nomorTelepon = nomorTelepon;
    }

    public void tampilkanPsikolog(){
        System.out.println("ID Psikolog:" + idPsikolog);
        System.out.println("Nama Psikolog:" + namaPsikolog);
        System.out.println("Spesialisasi:" + spesialisasi);
        System.out.println("Email:" + email);
        System.out.println("Nomor Telepon:" + nomorTelepon + "\n");
    }
}

class PsikologMain {
    public static void main(String[] args){
        psikolog psikolog1 = new psikolog(201, "Dr. Andi", "Konseling Remaja", "dr.andi@mentalcare.com", "08123456789");
        psikolog psikolog2 = new psikolog(202, "Dr. Budi", "Konseling Dewasa", "dr.budi@mentalcare.com", "08123456780");
        psikolog psikolog3 = new psikolog(203, "Dr. Cinta", "Konseling Anak", "dr.cinta@mentalcare.com", "08123456781");
        psikolog1.tampilkanPsikolog();
        psikolog2.tampilkanPsikolog();
        psikolog3.tampilkanPsikolog();
    }
}