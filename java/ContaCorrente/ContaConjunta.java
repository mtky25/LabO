package ContaCorrente;

public class ContaConjunta extends Conta{
    static final double TAXA_SAQUE = 2.0;
    static final double TAXA_TRANSF = 2.0;
    static final double TAXA_DEPO = 2.0;

    public ContaConjunta(Cliente []ostitulares, int agencia, int numero){
        super(ostitulares,agencia,numero);
    }

    public String toString() {
        return "CONTA CORRENTE CONJUNTA" + super.toString();
    }
    
}
