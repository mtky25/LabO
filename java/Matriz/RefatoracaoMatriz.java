package Matriz;

import java.util.Scanner;

public class Matriz{
    static int lin,col;
    static double[][] leMatriz(Scanner scanner,int lin ,int col){
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

    void imprimeMatriz(double[][] matriz, int lin, int col){
        for (int i = 0; i < lin; i++){
            for (int j = 0; j < col; j++){
                System.out.println(" " + matriz[lin][col]);
            }
            System.out.print("");
        }
    }
}

public static void main(String[] args) {
    double [][] A = 

}