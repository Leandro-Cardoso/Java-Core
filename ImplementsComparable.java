public class ImplementsComparable {
    /**
     * Implementacao de metodo para comparacao de objetos.
     * 
     * O metodo implementado "compareTo()" precisa retornar "0" quando os objetos forem iguais, um inteiro negativo quando for menor e um inteiro positivo diferente de "0" se for maior.
     */
    public static void main(String[] args) {
        Creature creature1 = new Creature("Humano", 100);
        Creature creature2 = new Creature("Gato", 70);
        Creature creature3 = new Creature("Cachorro", 60);

        System.out.println("\n Comparacao de " + creature1 + " e " + creature1 + " -> " + creature1.compareTo(creature1));
        System.out.println("\n Comparacao de " + creature3 + " e " + creature2 + " -> " + creature3.compareTo(creature2));
        System.out.println("\n Comparacao de " + creature1 + " e " + creature2 + " -> " + creature1.compareTo(creature2) + "\n");
    }
}

class Creature implements Comparable<Creature> {
    private String specie;
    private int life;

    public Creature(String specie, int life) {
        this.specie = specie;
        this.life = life;
    }

    public int getLife() {
        return this.life;
    }

    @Override
    public int compareTo(Creature o) {
        if (this.life == o.getLife()) {
            return 0;
        }
        else if (this.life > o.getLife()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.specie + " (" + this.life + ")";
    }
}
