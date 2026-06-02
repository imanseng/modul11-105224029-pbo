public class Main {
    public static void main(String[] args) throws Exception {
        AkunBank nasabah1 = new AkunBank("123456789", 10000000.0);
        AkunBank nasabah2 = new AkunBank("987654321", 5000000.0);
        try {
            nasabah1.tarikTunai(10000000.0);
            nasabah1.tarikTunai(999999999.0);
        } catch (SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            nasabah2.transfer(nasabah1, 11000000.0);
        } catch (SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
        } catch (BatasTransferHarianException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sesi transaksi ATM Anda telah diakhiri. Kartu dikeluarkan otomatis");
        }
    }
}
