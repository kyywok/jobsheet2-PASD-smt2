public class dosen04 {
    int idDosen;
    String nama;
    Boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(Boolean Status) {
        statusAktif = Status;
    }

    void hitungMasaKerja(int thnSkarang) {
        tahunBergabung += thnSkarang;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    dosen04() {
        
    }

    dosen04(int id, String nm, Boolean status, int thnBergabung, String bidang) {
        idDosen = id;
        nm = nama;
        status = statusAktif;
        thnBergabung = tahunBergabung;
        bidang = bidangKeahlian;
    }
}