public class Exo2 {
    public static int[] creerTableau(int n) {
        int[] tableau = new int[n];
        for (int i = 0; i < n; i++) {
            tableau[i] = i + 1;
        }
        return tableau;
    }
    public static int somme(int[] tab) {
        int sum = 0;
        for (int value : tab) {
            sum += value;
        }
        return sum;
    }
    public static void incremente(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }
}