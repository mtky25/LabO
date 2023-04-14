public class Carro extends Veiculo{
    private int cilindradas; //Atributos unicos dos Carros 
    // private boolean airbag;

    Carro (String modelo, String marca, int n_rodas, int cilindradas){ // Construtor
        super(modelo,marca,n_rodas);
        this.cilindradas = cilindradas;
    }

    public String toString() {
        return "Carro fabricado pela marca" + getMarca() + " com " + cilindradas + " cilindradas!";
    }

    public static void main(String args[]) { /*testes */

        Carro fordBigode = new Carro("bigode","ford",4,2900); 

        System.out.println("O veiculo criado foi " + fordBigode); /*toString faz com que a variavel Carro print em forma de String */ 
    }
}