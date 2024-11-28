package loopstatement;

public class ForStatementDemo {
    public static void main(String[] args) {
        example1();
    }

    private static void example1 () {
        for (int i = 0; i < 10; i++) { // 0 - 9
            System.out.println("Process round: " + (i+1));
        }
    }
}
