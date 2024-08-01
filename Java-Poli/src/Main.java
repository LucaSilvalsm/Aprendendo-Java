// Classe principal para demonstrar polimorfismo
public class Main {
    public static void main(String[] args) {
        // Cria um array de Animal que pode conter Cachorro e Gato
        Animal[] animais = new Animal[3];
        animais[0] = new Animal();
        animais[1] = new Cachorro();
        animais[2] = new Gato();

        // Itera sobre o array e chama fazerSom()
        for (Animal animal : animais) {
            animal.fazerSom(); // O método chamado depende do tipo real do objeto
        }
    }
}
