import java.util.InputMismatchException;
import java.util.Scanner;
public class Kalkulator {
        public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Angka Pembilang: ");
            int pembilang = input.nextInt();
            System.out.print("Masukkan Angka Penyebut: ");
            int penyebut = input.nextInt();
            int hasil = pembilang / penyebut;
            System.out.println("Hasil dari: " + pembilang + " / " + penyebut + " = " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("ERROR TIDAK BISA MELAKUKAN PEMBAGIAN DENGAN NOL");
            System.out.println("Detail error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ERROR INPUTAN TIDAK SESUAI");
            System.out.println("Detail error: " + e.getMessage());
        }
        finally {
            System.out.println("Program Selesai!");
        }
    }
}