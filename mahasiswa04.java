public class mahasiswa04 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama" + nama);
        System.out.println("NIM" + nim);
        System.out.println("Kelas" + kelas);
        System.out.println("IPK" + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(Double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKerja() {
        if (ipk >= 0.0 && ipk <= 4.0) {
            if (ipk >= 3.5) {
                return "kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "kinerja baik";
            } else if (ipk >= 2.0) {
                return "kinerja baik";
            } else {
                return "kinerja kurang";
            }
        } else {
            return "IPK tidak valid";
        }
    }
}