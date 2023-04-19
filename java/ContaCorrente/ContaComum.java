package ContaCorrente;

public class ContaComum extends Conta{
    public ContaComum(Cliente titular,int agencia, int numero){
        super(titular,agencia,numero);
    }
    public String toString() {
        return "CONTA CORRENTE COMUM" + super.toString();
    }
}
