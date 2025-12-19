package CIE;

import java.util.Scanner;

public class Internal {
    public int[] marks = new int[5];

    public void getInternalMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CIE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
    }
}
