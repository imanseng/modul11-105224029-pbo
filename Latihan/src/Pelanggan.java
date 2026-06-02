public class Pelanggan {
    private String nama;
    private int umur;
    private int stokKopi; // Soal 3

    Pelanggan() {
        this.stokKopi = 5; // Soal 3
    }

    public int getStokKopi() {
        return stokKopi;
    }

    public void pesanKopi(int jumlahPesanan) {
        if (jumlahPesanan > stokKopi) {
            throw new KopiHabisException("Maaf, stok kopi habis!");
        } else {
            stokKopi -= jumlahPesanan;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void daftarMember(int umur) {
        if (umur < 17) {
            throw new IllegalArgumentException("Maaf, umur Anda belum mencukupi untuk menjadi Member VIP");
        } else {
            this.umur = umur;
        }
    }
}
