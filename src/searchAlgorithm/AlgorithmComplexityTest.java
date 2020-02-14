package searchAlgorithm;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input string: ");
        String string = scanner.nextLine();

        int []frequentChar = new int[255];
        for (int i=0;i<string.length();i++){
            //tìm vị trí tương ứng trong bảng ascii
            int ascii = (int)string.charAt(i);
            //tăng giá trị tần suất
            frequentChar[ascii]+=1;
        }

        int max=0;
        char character = (char)255;
        for (int j=0;j<255;j++){
            if (frequentChar[j]>max){
                max = frequentChar[j];
                character=(char)j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
