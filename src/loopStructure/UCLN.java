package loopStructure;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b; ");
        int b = scanner.nextInt();
        if (a==0||b==0){
            System.out.println("Not greatest");
        }
        while (a!=b){
            if(a>b){
                a = a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("UCLN: "+a);
    }
}
