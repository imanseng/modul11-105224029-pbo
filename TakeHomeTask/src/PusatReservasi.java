import java.util.ArrayList;
import java.util.List;

public class PusatReservasi {
    private List<Kereta> daftarKereta;

    public PusatReservasi() {
        daftarKereta = new ArrayList<>();
        daftarKereta.add(new Kereta("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new Kereta("K02", "Parahyangan", "JKT - BDG", 15));
    }

    public List<Kereta> getDaftarKereta() {
        return daftarKereta;
    }

    public void pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket) throws RuteTidakDitemukanException, TiketHabisException {
        if (nik.length() != 16 || !nik.matches("[0-7]+")) { 
            throw new DataPenumpangTidakValidException("Error: NIK harus tepat 16 digit dan hanya berisi angka!");
        }

        Kereta keretaDipilih = null;
        for (Kereta k : daftarKereta) {
            if (k.getKodeKereta().equalsIgnoreCase(kodeKereta)) {
                keretaDipilih = k;
                break;
            }
        }

        if (keretaDipilih == null) {
            throw new RuteTidakDitemukanException("Error: Kode kereta atau rute " + kodeKereta + " tidak ditemukan!");
        }

        if (jumlahTiket > keretaDipilih.getSisaKursi()) {
            throw new TiketHabisException(keretaDipilih.getNamaKereta(), keretaDipilih.getSisaKursi());
        }

        keretaDipilih.kurangiKursi(jumlahTiket);
        System.out.println("RESERVASI BERHASIL");
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Kereta: " + keretaDipilih.getNamaKereta());
        System.out.println("Rute: " + keretaDipilih.getRute());
        System.out.println("Jumlah Tiket: " + jumlahTiket + " kursi");
    }
}
