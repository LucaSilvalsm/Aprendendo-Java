public class SmartTv {
    boolean ligada = false;
    String canal = "Globo";
    int volume = 50;

    public void ligar() {
        ligada = true;
        System.out.println("Smart TV ligada!");
    }
    
    public void desligar() {
        ligada = false;
        System.out.println("Smart TV desligada!");
    }






}