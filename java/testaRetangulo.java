import poligonos.*;


public class testaRetangulo{
    
    public boolean testaArea(Retângulo retangulo){
        if (retangulo.calculaÁrea() == 12)
            return true;
        else 
            return false;
    }

    public boolean testaPerimetro(Retângulo retangulo){
        if (retangulo.calculaPerimetro() == 14)
            return true;
        else 
            return false;
    }

    public void main(String[] args) {
        Retângulo testeRetangulo = new Retângulo(3,4);
        int passou = 0;

        if (testaPerimetro(testeRetangulo))
            passou += 1;
        System.out.println(passou);
    }
    
}