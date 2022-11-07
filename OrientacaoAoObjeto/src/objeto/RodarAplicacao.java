package objeto;

public class RodarAplicacao {
    public static void  main(String[] args) {
        Carro carro1= new Carro();


        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.totalValorTanque(5.30));

        Carro carro2= new Carro("Cinza","BMW 2",66);
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.totalValorTanque(5.30));
    }
}
