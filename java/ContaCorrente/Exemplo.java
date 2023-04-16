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

    Cliente[] clientes  = {Marcelo, Thainara, Michelangelo};
        for(Cliente cliente: clientes)
        System.out.println(cliente);
    }
}
