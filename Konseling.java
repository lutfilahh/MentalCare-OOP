import java.sql.Date;

class konseling {
    int idKonseling, idUser, idPsikolog;
    Date tanggalKonseling; 
    String status;

    public konseling(int idKonseling, int idUser, int idPsikolog, Date tanggalKonseling, String status){
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
        System.out.println("Status:" + status);
    }
}

public class Konseling {
    public static void main(String[] args){
        konseling konseling1 = new konseling(1, 101, 201, Date.valueOf("2024-07-01"), "Scheduled");
        konseling konseling2 = new konseling(2, 102, 202, Date.valueOf("2024-07-02"), "Completed");
        konseling konseling3 = new konseling(3, 103, 203, Date.valueOf("2024-07-03"), "Cancelled");
        konseling1.tampilanKonseling();
        konseling2.tampilanKonseling();
        konseling3.tampilanKonseling();
    }
}
