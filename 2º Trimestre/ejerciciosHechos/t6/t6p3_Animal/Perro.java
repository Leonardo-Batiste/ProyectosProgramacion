public class Perro extends Animal {

    @Override
    public String toString() {
        return "Guau";
    }

    @Override
    public void hacerSonido() {
        System.out.println(toString());
    }
}
