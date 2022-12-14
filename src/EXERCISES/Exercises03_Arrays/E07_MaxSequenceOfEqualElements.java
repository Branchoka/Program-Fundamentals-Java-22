package Exercises03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength=0;
        int length=1;

        int StartIndex=0;
        int bestStart=0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i-1]){
                length++;
            }else {
                length=1;
                StartIndex=i;
            }
            if (length>maxLength){
                maxLength=length;
                bestStart=StartIndex;
            }
        }
        for (int i = bestStart; i < bestStart+maxLength ; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
