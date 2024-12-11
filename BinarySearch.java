public class BinarySearch {
    /**
     * Algoritmo de busca binaria.
     */
    public static int n = 0;

    public static int search(int key, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        return BinarySearch.search(key, arr, start, end);
    }

    public static int search(int key, int[] arr, int start, int end) {
        n++;

        if (start > end) {
            return -1;
        }
    
        int middle = (start + end) / 2;
    
        if (arr[middle] == key) {
            return middle;
        } else if (arr[middle] < key) {
            return search(key, arr, middle + 1, end);
        } else {
            return search(key, arr, start, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int key = 0;

        // BUSCAR:
        int result = BinarySearch.search(key, arr);

        // PRINTS:
        System.out.println("\n> " + (result == -1 ? "Nenhum resultado encontrado !!!" : "A chave \"" + arr[result] + "\" foi encontrada na posicao \"" + result + "\"..."));
        System.out.println("> Numero de passos: " + BinarySearch.n + "\n");
    }
}
