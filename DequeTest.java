import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
    /**
     * Teste do "Deque".
     */
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("\n Deque: " + deque);

        // Adicionando elementos na frente:
        System.out.println("\n Adicionando e removendo no inicio:");

        deque.addFirst("A");
        System.out.println(" Deque: " + deque);

        deque.addFirst("B");
        System.out.println(" Deque: " + deque);

        deque.addFirst("C");
        System.out.println(" Deque: " + deque);

        // Removendo elementos na frente:
        while (deque.size() > 0) {
            deque.removeFirst();
            System.out.println(" Deque: " + deque);
        }

        // Adicionando elementos no fim:
        System.out.println("\n Adicionando e removendo no fim:");

        deque.addLast("A");
        System.out.println(" Deque: " + deque);

        deque.addLast("B");
        System.out.println(" Deque: " + deque);

        deque.addLast("C");
        System.out.println(" Deque: " + deque);

        // Removendo elementos no fim:
        while (deque.size() > 0) {
            deque.removeLast();
            System.out.println(" Deque: " + deque);
        }

        System.out.println();
    }
}
