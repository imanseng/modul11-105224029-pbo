public class App {
    public static void main(String[] args) throws Exception {
        // Untuk soal no 2 (Validasi Umur Pelanggan)
        try {
            Pelanggan p1 = new Pelanggan();
            p1.daftarMember(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Soal no 3 (Cek ketersediaan kopi)
        try {
            Pelanggan p2 = new Pelanggan();
            p2.pesanKopi(10);
        } catch (KopiHabisException e) {
            System.out.println(e.getMessage());
        }

        // Soal no 4
        try {
            MesinKasir m1 = new MesinKasir();
            m1.bayar(50000, 30000);
        } catch (UangKurangException e) {
            System.out.println(e.getMessage());
        }

        // SOal no 5
        try {
            MesinKasir m2 = new MesinKasir();
            m2.cetakStruk(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup.");
        }
    }
}
