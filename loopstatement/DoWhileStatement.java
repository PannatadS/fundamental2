package loopstatement;

public class DoWhileStatement {
    // ทำก่อนแล้วค่อยตรวจสอบเงื่อนไข
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        int count = 0;
        do {
            System.out.println("Process round: " + (count+1));
            count++;
        } while (count < 0);
    }
}
