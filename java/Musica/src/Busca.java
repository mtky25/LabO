public class Busca {


    public void busca90(Musica[] musicas){
        System.out.println("\n-----Lista de Músicas anos 90-----\n");
        for(Musica musica: musicas){
            if (musica.ano >= 1990 & musica.ano < 2000){
                System.out.println(musica.titulo);
            
            }
        }
    }

    public void buscaTitulo(Musica[] musicas,String titulo){
        System.out.println("\n-----Músicas com título: " + titulo + "-----\n"); 
        for(Musica musica: musicas){
            if(musica.titulo == titulo){
                System.out.println(musica.titulo);
            }
        }
    }

    public void buscaCompositor(Musica[] musicas,String compositor){
        System.out.println("\n-----Músicas do Compositor: " + compositor + "-----\n"); 
        for(Musica musica: musicas){
            if(musica.compositor == compositor){
                System.out.println(musica.titulo);
            }
        }
    }

    public void buscaInterprete(Musica[] musicas,String interprete){
        System.out.println("\n-----Músicas do Interprete----- " + interprete + "\n"); 
        for(Musica musica: musicas){
            if(musica.interprete == interprete){
                System.out.println(musica.titulo);
            }
        }
    }

    public void buscaPeriodo(Musica[] musicas,int inicio, int fim){
        System.out.println("\n-----Músicas no período de " + inicio + " até " + fim + "-----\n"); 
        for(Musica musica: musicas){
            if(musica.ano >= inicio & musica.ano <= fim){
                System.out.println(musica.titulo);
            }
        }
    }

    public void tamanhoMP3(MP3[] musicasMP3,int bytesLimite){
        System.out.println("\n-----Músicas de até " + bytesLimite +" bytes-----\n");
        for(MP3 musica: musicasMP3){
            if(musica.tamanho < bytesLimite){
                System.out.println(musica.titulo + " - " + musica.tamanho + " bytes");
            }

        }
    }
}
