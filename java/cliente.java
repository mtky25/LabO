class Cliente{
    public long CPF;
    public String nome;
    public String tipo;
    public Cliente(long CPF, String nome, String tipo){
        this.CPF = CPF;
        this.nome = nome;
        this.tipo = tipo;
    }
    public void exibir(){
        System.out.println("Nome: " + nome + "\nCPF: " + CPF + "\n tipo de Cliente: " + tipo);
    }
}

class Conta {
    Cliente [] titulares;
    Cliente [] dependentes;
    double saldo;
    int agencia;
    public Conta(Cliente [] titulares,Cliente [] dependentes,double saldo,int agencia){
        this.titulares = titulares;
        this.dependentes = dependentes;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    void depositar(double valor){
        saldo += valor;
    }

    boolean sacar(double valor){
        if (valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    boolean transferir(double valor, Conta para){
        if (valor > saldo) return false;
        else
            sacar(valor);
            para.depositar(valor);
            return true;
    }
}

class Individual extends Conta{
    public Individual(Cliente [] titulares,Cliente [] dependentes,double saldo,int agencia){
        super(titulares,dependentes,saldo,agencia);
    }
}


class exemplo{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1234567890,"Jimpas","Preferencial");
        Cliente cliente2 = new Cliente(987654321,"Thainere","Comum");

        Cliente clientes[] = {cliente1, cliente2};

        for (Cliente cliente: clientes) {
            cliente.exibir();
        }
    }
}