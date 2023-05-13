public class Vinil extends Musica {
    int velocidade;

    public Vinil (int ano,String titulo,String album,String compositor,String interprete,int velocidade){
        super(ano,titulo,album,compositor,interprete);
        this.velocidade = velocidade;
    }

    public String toString() {
        return  super.toString() + 
                "\n Velocidade: " + velocidade
                +"\n Formato: Vinil" ;
    }
}
