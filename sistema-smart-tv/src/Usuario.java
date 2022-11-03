public class Usuario {
    public static void main(String[] args) {
        SmartTv smartv= new SmartTv();

        System.out.println("A TV está ligado? "+smartv.ligada);
        System.out.println("Canal é : "+smartv.canal);
        System.out.println("Volume Atual : "+smartv.volume);

        smartv.ligar();
        System.out.println("A TV está ligado? "+smartv.ligada);

        smartv.aumentarVolume();
        smartv.aumentarVolume();
        smartv.aumentarVolume();
        System.out.println("Volume Atual : "+smartv.volume);

        smartv.desligar();
        System.out.println("A TV está ligado? "+smartv.ligada);

    }
}
