public class Gato extends Animal {
    @Override
    public String toString() {
        return "Miau";
    }

    @Override
    public void hacerSonido() {
        System.out.println(toString());
    }
}
