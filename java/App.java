import poligonos.*;


public class App {
    public static void main(String[] args) {
        // Cria pentágono regular de lado 4cm
        Poligono pentágono = new Poligono(5, 4, "pentágono");
        // pentágono._tipo = "pentágono"; // Gera erro de acesso
        System.out.println(pentágono);
        System.out.println("Perimetro do pentágono: " + pentágono.calculaPerimetro());
        Retângulo retângulo = new Retângulo(3, 4);
        System.out.println(retângulo);
        System.out.println("Área do retângulo: " + retângulo.calculaÁrea());
        retângulo._lados[0] = 10; // não gera erro de acesso pois _lados é protected
        // note que isso viola a modularidade do código
        System.out.println("Área do retângulo: " + retângulo.calculaÁrea());

        if (pentágono.éCompativelCom(retângulo)) 
          System.out.println("Pentágono e retângulo são compativeis");
        else
          System.out.println("Pentágono e retângulo não são compativeis");

        Retângulo quadrado = new Retângulo(5);
        System.out.println(quadrado);
        System.out.println("Área do quadrado: " + quadrado.calculaÁrea());

        System.out.println("Foram criados " + Poligono.quantosPoligonos() + " poligonos");

        if (Poligono.sãoCompativeis(quadrado, retângulo)) 
          System.out.println("Quadrado e retângulo são compativeis");
        else
          System.out.println("Quadrado e retângulo não são compativeis");

    }
}
