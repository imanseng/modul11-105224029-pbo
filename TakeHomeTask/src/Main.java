import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PusatReservasi sistemReservasi = new PusatReservasi();
        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        do {
            try {
                System.out.println("MENU UTAMA:");
                System.out.println("1. Lihat Jadwal");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1-3): ");
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.printf("%-10s %-15s %-15s %-10s\n", "Kode", "Nama Kereta", "Rute", "Sisa Kursi");
                        for (Kereta k : sistemReservasi.getDaftarKereta()) {
                            System.out.printf("%-10s %-15s %-15s %-10d\n", k.getKodeKereta(), k.getNamaKereta(), k.getRute(), k.getSisaKursi());
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan Kode Kereta: ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan NIK (16 digit): ");
                        String nik = input.nextLine();
                        System.out.print("Masukkan Nama Penumpang: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Jumlah Tiket: ");
                        int jumlah = input.nextInt();
                        input.nextLine();
                        sistemReservasi.pesanTiket(kode, nik, nama, jumlah);
                        break;
                    case 3:
                        System.out.println("Keluar dari sistem...");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid! Silakan pilih menu 1, 2, atau 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka!");
                input.nextLine();
            } catch (DataPenumpangTidakValidException e) {
                System.out.println(e.getMessage());
            } catch (RuteTidakDitemukanException e) {
                System.out.println(e.getMessage());
            } catch (TiketHabisException e) {
                System.out.println(e.getMessage());
                System.out.println("Info Kereta: " + e.getNamaKereta());
                System.out.println("Sisa Tersedia: " + e.getSisaKursi() + " kursi");
            }
        } while (pilihan != 3);
    }
}
