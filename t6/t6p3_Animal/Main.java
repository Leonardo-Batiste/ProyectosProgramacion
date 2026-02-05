public class Main {
    public static void rellenaArray(Animal[] listaAnimales) {
        for (int i = 1; i < listaAnimales.length; i += 2) {
            listaAnimales[i] = new Perro();
            listaAnimales[i - 1] = new Gato();
        }
    }

    public static void main(String[] args) {
        Animal[] arrayAnimales = new Animal[10];

        rellenaArray(arrayAnimales);

        for (int i = 0; i < 10; i++) {
            arrayAnimales[i].hacerSonido();
        }
    }
}
