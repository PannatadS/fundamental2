package loopstatement;

import java.util.Scanner;

public class ForEachStatement {
    // รูปย่อ for
    public static void main(String[] args) {
        String [] studentsName = new String [3];
        for (int i = 0; i < studentsName.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input Student name: ");
            studentsName[i] = sc.nextLine();
        }
        for (String name : studentsName) {
            System.out.println("Student Name: " + name);
        }
    }
}

