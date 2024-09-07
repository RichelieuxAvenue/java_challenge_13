public class Main {
    /*
Écrivez une méthode appelée printNumberInWord. Cette méthode a un paramètre number qui est un nombre entier. La méthode doit imprimer “ZERO”, “ONE”, “TWO”, … “NINE”, “OTHER” si le paramètre int number est 0, 1, 2, …, 9, ou “OTHER” pour tout autre nombre, y compris les nombres négatifs.

Vous pouvez utiliser une structure if-else ou une instruction switch, selon ce qui vous semble le plus facile.

REMARQUES :

	•	La méthode printNumberInWord doit être publique et statique (public static), car pour le moment, nous utilisons uniquement des méthodes statiques.
	•	N’ajoutez pas de méthode main dans le code de la solution.
     */
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }
    public static void main(String[] args) {
        printNumberInWord(1);
        printNumberInWord(2);
    }
}
