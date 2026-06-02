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
    }
}
