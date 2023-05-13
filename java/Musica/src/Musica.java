

public class Musica {
    int ano;
    String titulo;
    String album;
    String compositor;
    String interprete;
    
    public Musica (int ano,String titulo,String album,String compositor,String interprete){
        this.ano = ano;
        this.titulo = titulo;
        this.album = album;
        this.compositor = compositor;
        this.interprete = interprete;
    }

    public String toString(){  //print (this)
        String res = "\n--------------";
        res += "\n Titulo: "  + titulo;
        res += "\n Álbum: " + album;
        res += "\n Compositor: " + compositor;
        res += "\n Interprete: " + interprete;
        res += "\n Ano: " + ano;

        return res;
    }
}
