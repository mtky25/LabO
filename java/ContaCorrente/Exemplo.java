package ContaCorrente;


public class Exemplo {
    public static void main(String[] args) {
        
    
    Cliente Marcelo = new Cliente("Marcelo Takayama Russo",
                                1,
                                "25/4/2003",
                                new Endereco("Rua Tucuna",
                                969,"313",05021010,"São Paulo","SP"),
                                0);
    
    Cliente Thainara = new Cliente("Thainara de Assis Goulart",
                                    2,
                                    "9/1/2004",
                                    new Endereco("Rua Alberto Nascimento Júnior",
                                     178, "Bloco 3 - 142", 012345, "São Paulo", "SP"),
                                     1);
                    
    Cliente Michelangelo = new Cliente("Michelangelo Russo Neto",
                                        3,
                                        "9/3/1976",
                                        Marcelo.endereço,
                                        0);

    Cliente Jimpas = new Cliente("Joao Paulo",
                                4,
                                "26/4/2000",
                                Marcelo.endereço,
                                0);

    Cliente[] clientes  = {Marcelo, Thainara, Michelangelo,Jimpas};
        for(Cliente cliente: clientes)
        System.out.println(cliente);

    Conta ContaMichelangelo = new ContaComum(Michelangelo,12, 13);
        ContaMichelangelo.depositar(100);

    Cliente[] ContaConj = {Marcelo,Thainara};
    Conta ContaConjunta = new ContaConjunta(ContaConj, 10, 15);
        ContaConjunta.depositar(100);

    Conta ContaJimpas = new ContaPoupanca(Jimpas, 3, 5);
        ContaJimpas.depositar(100);


    Conta[] contas = {ContaMichelangelo,ContaConjunta,ContaJimpas};
    for (Conta conta:contas ){
        conta.tirarExtrato(); 
    }
}
}

    
