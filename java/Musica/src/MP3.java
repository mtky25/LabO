public class MP3 extends Musica {
    int tamanho;
    public MP3(int ano,String titulo,String album,String compositor,String interprete,int tamanho){
        super(ano,titulo,album,compositor,interprete);
        this.tamanho = tamanho;
    }

    public String toString() {
        return  super.toString()  + "\n tamanho: " + tamanho + " bytes" + "\n Formato: MP3";
    }

    

}
