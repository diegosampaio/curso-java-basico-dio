public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Novo Canal: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status - TV Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status - TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Novo Canal: " + smartTv.canal);

    }
}
