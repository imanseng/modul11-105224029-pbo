// Soal 4
public class MesinKasir {
    public void bayar(int totalBelanja, int uangDiberikan) throws UangKurangException {
        if (uangDiberikan < totalBelanja) {
            throw new UangKurangException("Uang diberikan kurang!");
        }
    }

    // SOal 5
    public void cetakStruk(boolean statusPrinter) throws Exception {
        if (statusPrinter == false) {
            throw new Exception("Printer error: Kertas struk habis!");
        }
    }
}
