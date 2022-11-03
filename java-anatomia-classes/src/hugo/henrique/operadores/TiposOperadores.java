package hugo.henrique.operadores;

public class TiposOperadores {
    public static void main (String [] args){

        //Aritimeticos
        double soma = 13.2+8.4;
        int subtracao = 10-3;
        int multiplicação = 20*2;
        int divisao = 15/3;
        int modulo=18%3;
        double resultado=(123*1)+(2000%100);

        //strings

        String nomeCompleto="Hugo"+"Henrique";
        System.out.println(nomeCompleto);

      
        //Unários

        int numero=1;
        numero = -numero;
        numero =numero*-1;

        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(++numero);

        boolean variavel=true;

        variavel=!variavel;

        //Logicos

        int a,b;
        a=5;
        b=6;

        String result="";

        if(a==b)
            result="verdadeiro";
        else
            result="false";

        //operador ternario

        result=a==b?"verdadeiro":"false";//mesmo if anterior

        //Relacioandos

        int num1=1;
        int num2=2;

        boolean simNo=num1==num2;

        simNo=num1!=num2;
        simNo=num1>num2;
        simNo=num1<num2;
        simNo=num1<=num2;
        simNo=num1>=num2;

        //strings

        String nome="Hugo";
        String nome2=new String("Hugo");
        //Mais recomendados para objetos
        nome.equals(nome2);
    
        //Lógicos
         boolean condicao1=true;
         boolean condicao2=false;


         if(condicao1&&condicao2){
            System.out.println("São verdadeiras");
         }
         if(condicao1||condicao2){
            System.out.println("Uma é verdadeira");
         }
    }
}
