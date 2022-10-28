package hugo.henrique.anatomia;
import javax.print.DocFlavor.STRING;

public class MinhaClasse {
    //Uma classe principal é necessaria "Main" e ela acaba precisando de um
    //parametro especial String[] args
    public static void main (String[] args){
        //corpo do metodo main
        System.out.print("Hello World \n");

        final String BR ="Brasil";
        //Pois a variavel com todas as letras maisculas é uma Constante, por padrão nao devemos alterar no código
        int ano =2021;
        ano=2022;
        //para declaração de variavel so podemos usa "-" ou "$" e nao podemos começar com números 
        //Se possivel usar sempre o camelCase

        int anoFabricacao=2020;
        String meuNome="Hugo";
        boolean verdadeira=true;
        String nomeCompleto=nomeCompleto(BR, meuNome);

        System.out.print(nomeCompleto);

     

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado: "+primeiroNome.concat(" ") + segundoNome;
    }


}
