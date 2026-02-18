public class dosenMain04 {
    public static void main(String[] args) {
        dosen04 ds1 = new dosen04();
        ds1.idDosen = 124343;
        ds1.nama = "wahyuni";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 5;
        ds1.bidangKeahlian = "mtk";

        ds1.setStatusAktif(true);
        ds1.tampilInformasi();

        System.out.println("============================");

        dosen04 ds2 = new dosen04(938498, "sri", false, 3, "IPA");
        ds2.setStatusAktif(true);
        ds2.tampilInformasi();

    }
}
