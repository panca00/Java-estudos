package UncheckedExceptions;

import javax.swing.JOptionPane;
    //Unchecked é um erro passivel de correção pelo metodos try catch
public class Unchecked {
    public static void main(String[] args) {
        
        boolean continueLoop=true;

        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado=dividir(Integer.parseInt(a),Integer.parseInt(b));
            System.out.println("Resultado: "+resultado);
            continueLoop=false;
        } catch (NumberFormatException e) {
            /*/e.printStackTrace(); */

            JOptionPane.showMessageDialog(null,"Entrada inválida,informe um número inteiro!"+e.getMessage());

        } catch(ArithmeticException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Impossivel dividir um número por zero!"+e.getMessage());

        }
         finally{
            System.out.println("Chegou ao finally!");
        }

        }while(continueLoop);
        

        System.out.println("Chegou ao fim do código!");
    }   


    public static int dividir(int a, int b){
        return a/b;
    }
}