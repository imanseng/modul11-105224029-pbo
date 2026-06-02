public class App {
    public static void main(String[] args) throws Exception {
        // Untuk soal no 2 (Validasi Umur Pelanggan)
        try {
            Pelanggan p1 = new Pelanggan();
            p1.daftarMember(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
