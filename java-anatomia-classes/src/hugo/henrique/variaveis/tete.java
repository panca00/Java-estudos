package hugo.henrique.variaveis;


import java.util.Scanner;

public class tete {
    public static void main(String[] args) {
        double A, B;
        A = 80000;
        B = 100000;
               

        int anos = 0;

        //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B
        while(A<=B){
          
          A=A+(A*0.03);
          B=B+(B*0.015);
          anos++;
          System.out.println(anos + " anos");
          System.out.println(A + " A");
          System.out.println(B + " B");
        }
        System.out.println(anos + " anos");
    }
}