import java.util.Scanner;

class Matriz{

    int lin,col;
    int [][]matriz;


    public Matriz(int lA, int cA,int lB,int cB){
        int nlin = lin
    }

    public void descrever(){
        System.out.println('linA = ' + linA);
        System.out.println('colA = ' + colA);
        System.out.println('linB = ' + linB);
        System.out.println('colB = ' + colB);
    }



    static double[][] lematriz(Scanner scanner,int lin ,int col){
        System.out.println("lendo matriz " + lin + "por" + col);
        double valor;
        double[][] matriz = new double[lin][col];  /*Alocação de Espaço */
        for (int i = 0; i< lin; i++){
            for (int j = 0; j < col; j++){
                valor = scanner.nextDouble();       /*Scanneia os valores de entrada do arquivo .txt */
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    static double [][] multmatriz(double [][] matrizA,double [][] matrizB, int linA, int colA,int linB,int colB){
        double [][] matrizRes = new double[linA][colB];
        double result;
        for (int i = 0; i < linA; i++){
            for (int j = 0; j < colB; j++){
                result = 0;
                for (int k = 0; k < linB; k++){
                    result = result + (matrizA[i][k] * matrizB[k][j]);
                    
                }
                matrizRes[i][j] = result;  
            }     
        }
        return matrizRes;
    }

    static void imprimematriz(double [][]matriz, int lin, int col){
        for (int i = 0; i < lin)
    }


    public static void main(String[] args) {
            if(args.length != 4) {  /* Se houver mais argumentos do que o necessário, o programa falha. */
                System.out.println("Use: Exercicio1  num_linA num_colA num_linB num_colB");
                return;
            }
    
            Scanner scanner = new Scanner(System.in);
            int numLinA = Integer.parseInt(args[0]);
            int numColA = Integer.parseInt(args[1]);
            int numLinB = Integer.parseInt(args[2]);
            int numColB = Integer.parseInt(args[3]);
    
            double [][] matrizA = lematriz(scanner, numLinA, numColA);
            double [][] matrizB = lematriz(scanner, numLinB, numColB);
            double [][] matrizRes = new double[numLinA][numColB];

            matrizRes = multmatriz(matrizA, matrizB, numLinA, numColA, numLinB, numColB);

            imprimematriz(matrizRes,numLinA,numColB);
    }
    

    
}
