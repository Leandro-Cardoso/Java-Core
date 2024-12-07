import java.util.List;
import java.util.ArrayList;

public class GenericType {
    /**
     * Utilizacao de um tipo generico "T" como parametro de classe.
     */
    public static void main(String[] args) {
        Heap<Life> heap = new Heap<>();

        Life life1 = new Life("Humano");
        Life life2 = new Life("Cachorro");
        Life life3 = new Life("Gato");
    
        heap.add(life1);
        System.out.println("\n" + heap + "\n");

        heap.add(life2);
        System.out.println(heap + "\n");

        heap.add(life3);
        System.out.println(heap + "\n");
    }
}

class Heap<T> {
    // UTILIZACAO DE TIPO GENERICO NA CLASSE
    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        String str = " Heap:";

        for (T element : this.elements) {
            if (element instanceof Life) {
                Life life = (Life) element;

                str += " " + life.getSpecie();
            }
        }

        return str;
    }
}

class Life {
    // TIPO A SER UTILIZADO
    private String specie;

    public Life(String specie) {
        this.specie = specie;
    }

    public String getSpecie() {
        return this.specie;
    }
}
