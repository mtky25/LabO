

public class App {
    public static void main(String[] args) throws Exception {
        Comparable[] inteiros = {1,5,3,47,3,2,1,36,78,2,3,6};
        Comparable[] reais = {1.3,6.4,2.5,7.4,6.7,5.4,3.2,3.4,6.5,0.3};
        Comparable[] palavras = {"b","k","t","g","l","m","c","ç"};

        Sorter ordenador = new Sorter();

        ordenador.sort(inteiros,2,true);
        ordenador.print(inteiros);

        ordenador.sort(reais,2,false);
        ordenador.print(reais);

        ordenador.sort(palavras,1,true);
        ordenador.print(palavras);

    }
}
