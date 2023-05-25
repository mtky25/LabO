import java.io.*;
import java.util.Scanner;

public class ES{
    public static void main(String[] args){
        try{
            int n = 0;

            int numero1 = 0;
            int numero2 = 0;
            int soma = 0;

            Scanner leitor = new Scanner(new FileReader(args[0]));
            PrintWriter saida;

            if(args.length < 2){
                saida = new PrintWriter(System.out);
            }
            else{
                saida = new PrintWriter(new FileWriter(args[0]));
            }

            while (leitor.hasNextLine()){

                if(n % 2 == 0){
                    numero1 = leitor.nextInt();
                }

                else{
                    numero2 = leitor.nextInt();
                    soma = numero1 + numero2;
                    saida.println(soma);
                }
                
                n += 1;
            }
            saida.close();
            leitor.close();


        } catch (FileNotFoundException e){
            System.out.println("Arquivo de entrada não encontrado");
     /*    }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ta dando problema de INDEX");
            */
        } catch (IOException e) {
            System.out.println("Arquivo de saída não pode ser escrito");
        } finally {
            System.out.println("Fechando todos os arquivos e encerrando programa");
          
        }

    }

}