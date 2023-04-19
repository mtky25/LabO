package ContaCorrente;


public class Conta {
    static final double TAXA_SAQUE = 0.0;
    static final double TAXA_TRANSF = 0.0;
    static final double TAXA_DEPO = 0.0;

    Cliente [] titulares;
    int agencia;
    int numero;
    double saldo = 0;

    public Conta(Cliente[] titulares, int agencia, int numero) {
        this.titulares = titulares;
        this.agencia = agencia;
        this.numero = numero;
    }

    void depositar(double valor){
        double taxa = calcularTaxaDepo();
        saldo += valor-taxa;
    }

    boolean transferir(double valor, Conta para){
        double taxa = calcularTaxaTransf(); 
        if ((valor+taxa) > saldo) return false;
        para.saldo += (valor+taxa);
        saldo -= (valor+taxa);
        return true;
    }
    
    boolean sacar(double valor){
        double taxa = calcularTaxaSaque();
        if ((valor+taxa) > saldo) return false;
        saldo -= (valor+taxa);
        return true;
    }

    public double calcularTaxaSaque() {
        return TAXA_SAQUE;
    }

    public double calcularTaxaTransf() {
        return TAXA_TRANSF;
    }

    public double calcularTaxaDepo() {
        return TAXA_TRANSF;
    }

    public String toString() {
        String res = "Conta";
        res += "\nAGÊNCIA: " + agencia;
        res += "\nNÚMERO: " + numero;
        for (Cliente titular: titulares) 
            res += titular.nome + "\n";
        return res;
    }

    void tirarExtrato() {
        System.out.println("-- EXTRATO -----------------");
        System.out.println(this);
        System.out.println("SALDO: R$" + saldo);
        System.out.println("----------------------------");
    }
}

