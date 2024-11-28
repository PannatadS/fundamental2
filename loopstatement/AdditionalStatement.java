package loopstatement;

public class AdditionalStatement {

    public static void main(String[] args) {
        breakStatementDemo ();
        continueStatementDemo ();
    }

    // โจทย์
    // มีเงิน 1000 บาท, ใช้เงินวันละ 100 บาท
    // เงินจะหมดวันที่เท่าไหร่ ?
    private static void breakStatementDemo () {
        double amount = 1000.0;
        double spentPerDay = 100.0;

        for (int i = 0;; i++) {
            amount -= spentPerDay;
            if (amount <= 0) {
                System.out.println("No money left on Day: "+ (i+1));
                break;
            }
            System.out.println("Remaining money: " + amount + " On Day: " + (i+1));
        }
    }

    // หาผลรวมเฉพาะเลขคู่
    private static void continueStatementDemo () {
        int sumEvenNum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1){
                continue; // ถ้า i % 2 แล้วเหลือเศษ 1 ข้ามการทำงานไป
            }
            System.out.println("i = " + i); // แสดงเฉพาะเลขคู่
            sumEvenNum += i; // เพิ่มเฉพาะเลขคู่
        }
        System.out.println("Summation of Even Number: " + sumEvenNum);
    }
}
