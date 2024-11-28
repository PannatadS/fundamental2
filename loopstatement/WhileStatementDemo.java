package loopstatement;

public class WhileStatementDemo {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        int count = 0;
        while (count < 10) {
            System.out.println("Process round: " + (count + 1));
            count++;
        }
    }
}
