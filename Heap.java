import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * O Heap e uma estrutura de lista com prioridade, que reepresenta uma arvore binaria.
 */
public class Heap<T> {

    private class Node {
        T element;
        int priority;

        Node(T element, int priority) {
            this.element = element;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "(" + element + ", " + priority + ")";
        }
    }

    private List<Node> elements = new ArrayList<>();

    /**
     * Adiciona um elemento com a prioridade definida.
     * Menor numero representa uma maior prioridade, sendo 1 a maior possivel
     * @param element
     * @param priority
     */
    public Node add(T element, int priority) {
        Node newNode = new Node(element, priority);
        this.elements.add(newNode);
        bubbleUp(this.elements.size() - 1);
        return newNode;
    }

    /**
     * Adiciona um elemento no final com a menor prioridade (maior número).
     * @param element
     */
    public void add(T element) {
        int defaultPriority = this.elements.isEmpty() ? 1 : this.elements.get(this.elements.size() - 1).priority + 1;
        this.add(element, defaultPriority);
    }

    /**
     * Remove e retorna o elemento com a maior prioridade (menor número).
     * @return O elemento com a maior prioridade.
     * @throws NoSuchElementException Se o heap estiver vazio.
     */
    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        Node root = this.elements.get(0);
        int lastIndex = this.elements.size() - 1;
        if (lastIndex > 0) {
            this.elements.set(0, this.elements.remove(lastIndex));
            bubbleDown(0);
        } else {
            this.elements.remove(0);
        }
        return root.element;
    }

    /**
     * Retorna o elemento de maior prioridade.
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        return this.elements.get(0).element;
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public int size() {
        return this.elements.size();
    }

    /**
     * Sobe elemento na lista.
     * @param index
     */
    private void bubbleUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && this.elements.get(index).priority < this.elements.get(parentIndex).priority) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    /**
     * Desce elemento na lista.
     * @param index
     */
    private void bubbleDown(int index) {
        int leftChildIndex;
        int rightChildIndex;
        int smallestIndex = index;
        int n = this.elements.size();

        while (true) {
            leftChildIndex = 2 * index + 1;
            rightChildIndex = 2 * index + 2;

            if (leftChildIndex < n && this.elements.get(leftChildIndex).priority < this.elements.get(smallestIndex).priority) {
                smallestIndex = leftChildIndex;
            }

            if (rightChildIndex < n && this.elements.get(rightChildIndex).priority < this.elements.get(smallestIndex).priority) {
                smallestIndex = rightChildIndex;
            }

            if (smallestIndex == index) {
                break;
            }

            swap(index, smallestIndex);
            index = smallestIndex;
        }
    }

    /**
     * Troca elemento de posicao.
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        Node temp = this.elements.get(i);
        this.elements.set(i, this.elements.get(j));
        this.elements.set(j, temp);
    }

    @Override
    public String toString() {
        return "Heap: " + this.elements.toString();
    }

    public static void main(String[] args) {
        Heap<String> heap = new Heap<>();

        System.out.println("\nAdicionando: " + heap.add("B", 3));
        System.out.println(heap);
        System.out.println("Adicionando: " + heap.add("A", 1));
        System.out.println(heap);
        System.out.println("Adicionando: " + heap.add("C", 2));
        System.out.println(heap);
        System.out.println("Adicionando: " + heap.add("D", 4));
        System.out.println(heap);

        System.out.println("\nRemovendo: " + heap.remove());
        System.out.println(heap);
        System.out.println("Removendo: " + heap.remove());
        System.out.println(heap);

        System.out.println("\nProximo: " + heap.peek() + "\n");
    }
}
