public class matakuliahMain04 {
    public static void main(String[] args) {
        matakuliah04 matkul1 = new matakuliah04();

        matkul1.kodeMk = "912818219";
        matkul1.nama = "PASD";
        matkul1.sks = 5;
        matkul1.jumlahJam = 15;

        matkul1.tambahJam(5);
        matkul1.tampilInformasi();

        System.out.println("=============================");

        matakuliah04 matkul2 = new matakuliah04("18372", "sijdfsi", 5, 20);
        matkul2.kurangiJam(2);
        matkul2.tampilInformasi();

    }
}
