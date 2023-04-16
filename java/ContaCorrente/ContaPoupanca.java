package ContaCorrente;


public class ContaPoupanca extends Conta{
    static final double TAXA = 15.0;

    private double taxa = TAXA;

    double saldo = 0;

    public ContaPoupanca(Cliente titular, int agencia, int numero){
        super(new Cliente[1], agencia, numero);
        this.titulares[0] = titular;
    }
}

