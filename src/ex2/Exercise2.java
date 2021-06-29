package ex2;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scanner= new Scanner(System.in);
        String text = scanner.nextLine();
        StringTokenizer string = new StringTokenizer(text);
        System.out.println("Result: ");
        while (string.hasMoreTokens()) {
            System.out.println(string.nextToken());
        }
    }
}