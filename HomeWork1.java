/**
 * Java 1 HomeWork #1
 *
 * @author Denis Grishin
 * @version 10.12.2021-11.12.2021
 */
class HomeWorkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumders();
   }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 17;
        int b = -23;
        System.out.println((a + b >= 0) ? "Сумма положительная!" : "Сумма отрицательная!");
    }

    static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("RED");
        } else if (value <= 100) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");
        }
    }   

    static void compareNumders() {
        int a = 17;
        int b = 23;
        System.out.println((a >= b) ? " a >= b " : " a < b ");
    }
}

