public class Paire {

    public static void printIsOdd(int n) {
        System.out.println(n % 2 != 0);
    }

    public static void main(String[] args) {
        int n = 8;
        printIsOdd(n);
    }
}