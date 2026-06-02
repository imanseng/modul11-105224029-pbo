public class SaldoTidakMencukupiException extends Exception {
    private double kurangSaldo;
    public SaldoTidakMencukupiException(double kurangSaldo) {
        super("Saldo tidak mencukupi!");
        this.kurangSaldo = kurangSaldo;
        System.out.println("Saldo kurang sebesar: " + kurangSaldo);
    }
    
    public double getKurangSaldo() {
        return kurangSaldo;
    }
}
