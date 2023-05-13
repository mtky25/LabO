package poligonos;


public class Poligono {
    public int[] _lados; // tipo protected -> acesso somente dentro do package
                            // tipo private -> acesso somente dentro da classe
                            // tipo public -> acesso para arquivos que implementam essa package


    private String _tipo;   // trocar por protected, expõe atributo para outras classes
                            // no mesmo pacote, violando encapsulamento

    private String _unidade = "cm"; // unidade de medida

    private static final String id = "001"; // não pode ser alterado
    private static int _no_poligonos = 0;

    // Cria um poligono com array de lados e descrição de tipo.
    // Se construtor não for public, não podemos criar novo objeto 
    // (usaremos isso mais para a frente)
    public Poligono(int[] lados, String tipo) {
        _lados = lados;
        _tipo = tipo;
        _no_poligonos += 1; // incrementa total de objetos dessa classe (ou subclasses) criados
    }

    public Poligono(int[] lados) {
        this(lados, "poligono"); // chama construtor acima
    }

    // Cria poligono regular com dado descrição tipo (num_lados > 0)
    public Poligono(int num_lados, int tam_lado, String tipo) {
        this(new int[num_lados]); // chama construtor acima
        for (int i = 0; i < num_lados; i++) _lados[i] = tam_lado;
        _tipo = tipo;
    }

    // Poligono regular (numn_lados > 0)
    public Poligono(int num_lados, int tam_lado) {
        this(num_lados, tam_lado, "poligono regular"); // chama construtor acima
    }

    public static int quantosPoligonos() {
        return _no_poligonos;
    }

    // Verifica se poligonos possuem mesma unidade de medida
    public boolean éCompativelCom(Poligono outro) {
        return _unidade.equals(outro._unidade);
    }
    public static boolean sãoCompativeis(Poligono um, Poligono outro) {
        return um._unidade.equals(outro._unidade);
    }

    // se método não for público, não é possivel chamá-lo de outra classe
    // p.ex., se alterar para private, chamada em App.java gera erro
    public int calculaPerimetro() {
        int p = 0;
        for (int lado: _lados) p += lado;
        return p;
    }

    @Override
    public String toString() {
        return "Eu sou um " + _tipo + " com " + calculaPerimetro() + _unidade + " de perimetro";
    }

}