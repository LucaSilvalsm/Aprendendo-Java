public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Agora a TV esta: " + smartTv.ligada);
    }
}
