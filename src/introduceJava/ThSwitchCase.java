package introduceJava;

import java.util.Scanner;

public class ThSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count day?");
        int month = scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month "+ month + " has 31 days");
                break;
            case 2:
                System.out.println("the month "+ month + " has 28 or 29 days");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month "+ month + " has 30 days");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
