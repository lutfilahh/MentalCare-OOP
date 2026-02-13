import java.sql.Date;

class MentalCaare {
    int idKonseling, idUser, idPsikolog;
    Date tanggalKonseling;
    String status;

    public MentalCaare(int idKonseling, int idUser, int idPsikolog, Date tanggalKonseling, String status){
        this.idKonseling = idKonseling;
        this.idUser = idUser;
        this.idPsikolog = idPsikolog;
        this.tanggalKonseling = tanggalKonseling;
        this.status = status;
    }

    public void tampilanKonseling(){
        System.out.println("ID Konseling:" + idKonseling);
        System.out.println("ID User:" + idUser);
        System.out.println("ID Psikolog:" + idPsikolog);
        System.out.println("Tanggal Konseling:" + tanggalKonseling);
        System.out.println("Status:" + status + "\n");
    }
}

public class Konseling {
    public static void main(String[] args){
        MentalCaare konseling1 = new MentalCaare(1, 101, 201, Date.valueOf("2024-07-01"), "Scheduled");
        MentalCaare konseling2 = new MentalCaare(2, 102, 202, Date.valueOf("2024-07-02"), "Completed");
        MentalCaare konseling3 = new MentalCaare(3, 103, 203, Date.valueOf("2024-07-03"), "Cancelled");
        konseling1.tampilanKonseling();
        konseling2.tampilanKonseling();
        konseling3.tampilanKonseling();
    }
}
