public class mahasiswaMain04 {
    public static void main(String[] args) {
        mahasiswa04 mhs1 = new mahasiswa04();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "254107060021";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        System.out.println("===========================");

        mahasiswa04 mhs2 = new mahasiswa04("Annisa Nabila", "254107060021", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
