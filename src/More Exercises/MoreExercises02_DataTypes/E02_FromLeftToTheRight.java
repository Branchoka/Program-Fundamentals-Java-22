package MoreExercises02_DataTypes;

import java.util.Scanner;

public class E02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String line=scanner.nextLine();

            String leftString="";
            String rightString="";

            for (int j = 0; j < line.length(); j++) {
                char currentSymbol = line.charAt(j);
                if (currentSymbol == 32) {
                    leftString = rightString;
                    rightString = "";
                    continue;
                }
                rightString += currentSymbol;
            }
            double leftNumber=Double.parseDouble(leftString);
            double rightNumber=Double.parseDouble(rightString);
            int sum=0;

            if (leftNumber>rightNumber){
                for (int j = 0; j < leftString.length(); j++) {
                    char letter=leftString.charAt(j);
                    if (letter>=48 && letter<=57){
                        String word="" + letter;
                        int digit=Integer.parseInt(word);
                        sum+=digit;
                    }
                }
            }else {
                for (int j = 0; j < rightString.length(); j++) {
                    char letter=rightString.charAt(j);
                    if (letter >=48 && letter <=57){
                        String word="" + letter;
                        int digit=Integer.parseInt(word);
                        sum+=digit;
                    }
                }
            }
            System.out.println(sum);
        }

    }
}
