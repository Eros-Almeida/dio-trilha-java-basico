public class Usario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("SmartTv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> SmartTv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> SmartTv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Volume: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(20);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
