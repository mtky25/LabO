import java.util.Scanner;

class Exercicio1{
    /*amo o momo */
    /* funçao responsável por ler a matriz de entrada. Parâmetro Scanner IMPORTANTE para isso.*/
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
        

        System.out.println("\nMatriz A * Matriz B\n");
        double result;
    

        for (int i = 0; i < numLinA; i++){
            for (int j = 0; j < numColB; j++){
                result = 0;
                for (int k = 0; k < numLinB; k++){
                    result = result + (matrizA[i][k] * matrizB[k][j]);
                    
                }
                matrizRes[i][j] = result;
                System.out.print(" " + result);   
            }
            System.out.println("");      
        }
    }
}

/* COMO rodar código com entrada vinda de txt:
 * 1. abrir o debugger (play + joaninha) e criar jason file.
 * 2. add config e adicionar laung program with auguments prompt.
 * 3. copiar ultima linha do que foi criado e deletar
 * 4. colar oq foi copiado no final da ultima chave do codigo
 * 5. voltar ao codigo nomral e rodar com 
 *  java nome_arquivo.java _argumentos_ <nome_do_texto.txt
 */
