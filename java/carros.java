
class Veiculo {
    public String modelo;
    public String marca;
    public int n_rodas;
    public Veiculo(String modelo, String marca, int n_rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.n_rodas = n_rodas;
    }
    public void dealhes() {
        System.out.println("Veiculo Modelo = " + modelo + ", marca = " + marca + " n_rodas = " + n_rodas);
    }
}
/* subclasse carro */ 

class Carro extends Veiculo {
    public Carro(String modelo, String marca) {
        super(modelo,marca,4);
    }
}

class Moto extends Veiculo {
    public Moto(String modelo, String marca) {
        super(modelo,marca,2);
    }
}

