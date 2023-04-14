public class Veiculo {
    public String modelo;
    public String marca;
    public int n_rodas;

    Veiculo(String modelo, String marca, int n_rodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.n_rodas = n_rodas;
    }

    public String getMarca(){
        return marca;
    }
}

