public class matakuliah04 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("kodeMk : " + kodeMk);
        System.out.println("nama : " + nama);
        System.out.println("sks : " + sks);
        System.out.println("jumlahJam : " + jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        jumlahJam -= jam;
    }

    matakuliah04() {

    }

    matakuliah04(String kodeMk, String nm, int sks, int jumlahJam) {
        this.kodeMk = kodeMk;
        nm = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
