public class AkunBank {
    private String nomorRekening;
    private double saldo;
    private double totalTransferHariIni;

    public AkunBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.totalTransferHariIni = 0.0;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException {
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException(this.getSaldo() - nominal);
        } else {
            saldo -= nominal;
        }
    }

    public void transfer(AkunBank tujuan, double nominal) throws SaldoTidakMencukupiException, BatasTransferHarianException {
        if (totalTransferHariIni + nominal > 10000000) {
            throw new BatasTransferHarianException("Batas transfer harian telah tercapai!");
        } 
        else if (nominal > saldo) {
            throw new SaldoTidakMencukupiException(this.getSaldo() - nominal);
        } 
        else {
            saldo -= nominal;
            tujuan.saldo += nominal;
            totalTransferHariIni += nominal;
        }
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotalTransferHariIni() {
        return totalTransferHariIni;
    }
}
