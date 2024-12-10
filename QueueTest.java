import java.util.Queue;
import java.util.LinkedList;

public class QueueTest {
    /**
     * Teste do "Queue" (fila).
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("\n Fila: " + queue);

        // Adicionando elementos:
        queue.add("A");
        System.out.println("\n Fila: " + queue);

        queue.add("B");
        System.out.println("\n Fila: " + queue);

        queue.add("C");
        System.out.println("\n Fila: " + queue);

        // Removendo elementos:
        while (queue.size() > 0) {
            queue.poll();
            System.out.println("\n Fila: " + queue);
        }
        
        System.out.println();
    }
}
