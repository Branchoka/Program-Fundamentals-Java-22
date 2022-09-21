package Exercises_Basic;

import java.util.Scanner;

public class GamingStore__03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double currentBalance=Double.parseDouble(scanner.nextLine());
        String input=scanner.nextLine();
        double totalSpend=0;

        while (!input.equals("Game Time")) {

            if (currentBalance > 0){
                switch (input){
                    case "CS: OG":
                        if (currentBalance>=15.99){
                            currentBalance-=15.99;
                            totalSpend+=15.99;
                            System.out.println("Bought " + input);
                        if (currentBalance<=0){
                        System.out.println("Out of money!");
                        return;}
                    }else {
                        System.out.println("Too Expensive");
                    }
                        break;
                    case "Zplinter Zell":
                        if (currentBalance>=19.99){
                            currentBalance-=19.99;
                            totalSpend+=19.99;
                            System.out.println("Bought " + input);
                        if (currentBalance<=0){
                        System.out.println("Out of money!");
                        return;}
                    }else {
                        System.out.println("Too Expensive");
                    }
                        break;
                    case "RoverWatch":
                        if (currentBalance>=29.99){
                            currentBalance-=29.99;
                            totalSpend+=29.99;
                            System.out.println("Bought " + input);
                        if (currentBalance<=0){
                        System.out.println("Out of money!");
                        return;}
                    }else {
                        System.out.println("Too Expensive");
                    }
                        break;
                    case "RoverWatch Origins Edition":
                        if (currentBalance>=39.99){
                            currentBalance-=39.99;
                            totalSpend+=39.99;
                            System.out.println("Bought " + input);
                        if (currentBalance<=0){
                        System.out.println("Out of money!");
                        return;}
                    }else {
                        System.out.println("Too Expensive");
                    }
                        break;
                    case "Honored 2":
                        if (currentBalance>=59.99){
                            currentBalance-=59.99;
                            totalSpend+=59.99;
                            System.out.println("Bought " +input);
                        if (currentBalance<=0){
                        System.out.println("Out of money!");
                        return;}
                    }else {
                        System.out.println("Too Expensive");
                    }
                        break;
                    case "OutFall 4":
                        if (currentBalance>=39.99){
                            currentBalance-=39.99;
                            totalSpend+=39.99;
                            System.out.println("Bought " + input);
                        if (currentBalance<=0){
                        System.out.println("Out of money!");
                        return;}
                    }else {
                        System.out.println("Too Expensive");
                    }
                        break;
                    default:
                        System.out.println("Not Found");
                        break;
                }
            }else {
                System.out.println("Out of money!");
                return;
            }
            input=scanner.nextLine();

        }
        System.out.printf("Total spent: $%.2f.",totalSpend);
        System.out.printf(" Remaining: $%.2f",currentBalance);
    }
}
