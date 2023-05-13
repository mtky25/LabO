public class CD extends Musica{
    public CD (int ano,String titulo,String album,String compositor,String interprete){
        super(ano,titulo,album,compositor,interprete);
    }
    
    public String toString(){
        return  super.toString() + "\n Formato: CD ";
    }
}
