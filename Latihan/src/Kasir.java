import java.util.*;

public class Kasir {
    public static void main(String[] args) {
        try {
            int daftarHarga[] = new int[3];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                System.out.print("Masukkan Harga Barang " + (i + 1) + ": ");
                daftarHarga[i] = input.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harga harus berupa angka!");
            System.out.println("Detail error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Kapasitas memori harga sudah penuh!");
            System.out.println("Detail error: " + e.getMessage());
        } finally {
            System.out.println("Program Selesai!");
        }
    }
}
