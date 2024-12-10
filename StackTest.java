import java.util.Stack;

public class StackTest {
    /**
     * Teste do "Stack" (pilha).
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("\n Pilha: " + stack);

        // Adicionando elementos:
        stack.add("A");
        System.out.println("\n Pilha: " + stack);

        stack.add("B");
        System.out.println("\n Pilha: " + stack);

        stack.add("C");
        System.out.println("\n Pilha: " + stack);

        // Removendo elementos:
        while (stack.size() > 0) {
            stack.pop();
            System.out.println("\n Pilha: " + stack);
        }

        System.out.println();
    }
}
