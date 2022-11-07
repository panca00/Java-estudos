package Herança;

public class RodaAplicacao {
    public static void main(String[] args) {
        /*
        Funcionario funcionario=new Funcionario();

        Funcionario gerente= new Gerente();
        Funcionario vendedor= new Vendedor();
        Funcionario faxineiro=new Faxineiro();
        

        Vendedor vendedor_=(Vendedor) new Funcionario();
         */
        ClasseMae[] classes= new ClasseMae[]{new ClasseFilha1(),new ClasseFilha2(),new ClasseMae()};
        //polimorfismo e sobreescrita
        for (ClasseMae classe:classes){
            classe.metodo1();
        }
        System.out.println("");

        for (ClasseMae classe:classes){
            classe.metodo2();
        }

        System.out.println("");
        //sobreescrita pura
        ClasseFilha2 classeFilha2= new ClasseFilha2();
        classeFilha2.metodo2();
    } 
}
