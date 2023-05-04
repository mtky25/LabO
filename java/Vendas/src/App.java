import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    static Venda leVenda(Scanner ler){
        String nome = ler.nextLine();
        double valor = Double.parseDouble(ler.nextLine());
        int codigo = Integer.parseInt(ler.nextLine());
        
        Venda venda = new Venda(codigo,valor,nome);
        return venda;
    }

    public static void main(String[] args) {

        ArrayList<Venda> vendas =new ArrayList<>();
        
        int n_vendas = Integer.parseInt(args[0]);
        Scanner ler = new Scanner(System.in);

            for (int i = 0; i < n_vendas; i++){
                Venda venda = leVenda(ler);
                vendas.add(venda);
            }
        
        for (Venda i: vendas){
        System.out.println(i);
        i.calculaReceitaBruta();
        i.calculaReceitaLiquida();
        i.imprimeInfo();
        }
    }
}
