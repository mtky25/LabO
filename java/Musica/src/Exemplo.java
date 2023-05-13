

public class Exemplo{
    
    public static void main(String[] args) throws Exception {
        Busca busca = new Busca();
        

        CD musica1 = new CD(
                                    1997,
                                    "Everlong",
                                    "The Colour and The Shape",
                                    "Foo Fighters",
                                    "Foo Fighters"
                                    );
       
        CD musica2 = new CD(
                                    1985,
                                    "Everybody Wants to Rule the World",
                                    "Songs from the Big Chair",
                                    "Tears for Fears",
                                    "Tears for Fears"
                                    );

        CD musica3 = new CD(
                                    1995,
                                    "Wonderwall",
                                    "(What's The Story) Morning Glory",
                                    "Oasis",
                                    "Oasis"
                                    );

        CD musica4 = new CD(
                                    1997,
                                    "When I Come Around",
                                    "Dookie",
                                    "Green Day",
                                    "Green Day"
                                    );

        

        MP3 musica5 = new MP3(1978,
                                    "September",
                                    "The Best of Earth, Wind & Fire Vol. 1",
                                    "Earth, Wind & Fire",
                                    "Earth, Wind & Fire",
                                    326);

        MP3 musica6 = new MP3(1973,
                                    "Dream On",
                                    "Aerosmith",
                                    "Aerosmith",
                                    "Aerosmith",
                                    512);

        MP3 musica7 = new MP3(1990,
                                    "Send Me An Angel",
                                    "Crazy World",
                                    "Scorpions",
                                    "Scorpions",
                                    1000);
    
        

        Vinil musica8 = new Vinil(1987,
                                  "Sweet Child O'Mine",
                                  "Appetite for Destruction",
                                  "Guns N' Roses",
                                  "Guns N' Roses",
                                  33
        );

        Vinil musica9 = new Vinil(1990,
                                  "Thunderstruck",
                                  "The Razors Edge",
                                  "AC/DC",
                                  "AC/DC",
                                  45
        );

        Vinil musica10 = new Vinil(1979,
                                  "Highway to Hell",
                                  "Highway to Hell",
                                  "AC/DC",
                                  "AC/DC",
                                  78
        );

    CD[] CDArray = {musica1,musica2,musica3,musica4};
    MP3[] MP3array = {musica5,musica6,musica7};    
    Vinil[] VinilArray = {musica8,musica9,musica10};
    Musica[] musicaArray = {musica1,musica2,musica3,musica4,musica5,musica6,musica7,musica8,musica9,musica10};


        for (Musica musica: musicaArray){
            System.out.println(musica);
        }

        busca.busca90(musicaArray);
        busca.buscaCompositor(musicaArray,"Foo Fighters");
        busca.buscaPeriodo(musicaArray, 1980,1990);
        
        for(CD musicaCD: CDArray){
            System.out.println(musicaCD);
        }

        for(MP3 musicaMP3: MP3array){
            System.out.println(musicaMP3);
        }

        for(Vinil musicaVinil : VinilArray){
            System.out.println(musicaVinil);
        }

        busca.tamanhoMP3(MP3array, 750);

    }
}
