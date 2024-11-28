package loopstatement.practice;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows to display star: ");
        int totalRows = Integer.parseInt(sc.nextLine());
        pattern1(totalRows);
        pattern2(totalRows);
    }

    private static void pattern1 (int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int rows) {
        for (int i = 0 ;i < rows; i++) {
            // ช่องว่าง
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // พิมพ์ดาว
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
