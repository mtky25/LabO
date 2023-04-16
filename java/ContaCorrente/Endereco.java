package ContaCorrente;


class Endereco {
    String logradouro;
    int numero;
    String complemento;
    int CEP;
    String cidade;
    String estado;

    public Endereco(String logradouro,int numero, String complemento, int CEP,String cidade,String estado){
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP =  CEP;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString(){
        String res = "Endereço:-------- ";
        res += "\nLogradouro: "+logradouro;
        res += "\nNúmero: "+ numero;

        if (complemento != null)
            res += "\nComplemento: " + complemento;
        res += "\nCEP: " + CEP;
        res += "\nCidade: " + cidade;
        res += "\nEstado: " + estado;    

        return res;
    }
}
