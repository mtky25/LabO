package ContaCorrente;


class Cliente{
     int CPF;
     String nome;
     int tipo;
     String dataNascimento;
     Endereco endereço;

    public Cliente(String nome, int CPF, String dataNascimento, Endereco endereço, int tipo) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.tipo = tipo;
    }

    public String toString() {
        String res = "-- Cliente ---------------------";
        res += "\nNOME: " + nome;
        res += "\nCPF: " + CPF;
        res += "\nData de nascimento: " + dataNascimento;
        res += "\nEndereço: " + endereço;
        if (tipo == 1) 
            res += "\n*** PREFERENCIAL";
        else
            res += "\n*** COMUM";
        return res;
    }
    
}


