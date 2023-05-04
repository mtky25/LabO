
public class Venda{

    static final double IMPOSTO = 0.0;
    static final double FRETE = 0.0;

    int codigo;
    double valor;
    String nome;

    double imposto = 0.0;
    double frete = 0.0;
    double RecLiq = 0.0;
    double RecBru = 0.0;

    public Venda(int codigo, double valor, String nome){
        this.codigo = codigo;
        this.valor = valor;
        this.nome = nome;
    }

    public double getImposto(){
        return IMPOSTO;
    }

    public double getFrete(){
        return FRETE;
    }

    void calculaImposto() {
        double tipo_imposto = getImposto();
        imposto += tipo_imposto * valor;
    }

    void calculaFrete() {
        double tipo_FRETE = getFrete();
        frete += tipo_FRETE;
    }

    void calculaReceitaBruta(){
        RecBru += valor;
    }

    void calculaReceitaLiquida(){
        double tipo_FRETE = getFrete();
        double tipo_imposto = getImposto();
        RecLiq += (valor - tipo_FRETE - tipo_imposto*valor);
    }

    public void imprimeInfo(){
        System.out.println("VALOR De FRETE: " + frete);
        System.out.println("VALOR De IMPOSTO:" + imposto);
        System.out.println("RECEITA BRUTA: "+ RecBru );
        System.out.println("RECEITA LIQUIDA: " + RecLiq);
        System.out.println("--------------------------");
    }


    public String toString() {
        String res = "--Vendas-------------";
        res += "\nNome: " + nome;
        res += "\nValor: " + valor;
        res += "\nCódigo: " + codigo;
        return res;
    }

}