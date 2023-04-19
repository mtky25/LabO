package ContaCorrente;


public class ContaPoupanca extends Conta{
    static final double TAXA_SAQUE = 0.0;
    static final double TAXA_TRANSF = 0.0;
    static final double TAXA_DEPO = 0.0;

    double saldo = 0;

    public ContaPoupanca(Cliente titular, int agencia, int numero){
        super(new Cliente[1], agencia, numero);
        this.titulares[0] = titular;
    }

    public String toString() {
        return "POUPANÇA" + super.toString();
    }
}

