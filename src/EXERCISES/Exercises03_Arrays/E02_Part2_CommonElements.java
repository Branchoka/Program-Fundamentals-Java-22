package Exercises03_Arrays;

import java.util.Scanner;

public class E02_Part2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String[] firstArray= scanner.nextLine().split(" ");
        String[] secondArray=scanner.nextLine().split(" ");

        for (String elementSecond : secondArray) {
            for (String elementFirst:firstArray) {
                if (elementSecond.equals(elementFirst)){
                    System.out.print(elementSecond + " ");

                }
            }
        }

    }
}
