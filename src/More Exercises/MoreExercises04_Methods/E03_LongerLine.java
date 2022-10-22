package MoreExercises04_Methods;

import java.util.Scanner;

public class E03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x1=Integer.parseInt(scanner.nextLine());
        int y1=Integer.parseInt(scanner.nextLine());
        int x2=Integer.parseInt(scanner.nextLine());
        int y2=Integer.parseInt(scanner.nextLine());

        int x3=Integer.parseInt(scanner.nextLine());
        int y3=Integer.parseInt(scanner.nextLine());
        int x4=Integer.parseInt(scanner.nextLine());
        int y4=Integer.parseInt(scanner.nextLine());

        getLongestLine(x1,y1,x2,y2,x3,y3,x4,y4);

    }
    public static void ClosestToZero(double a,double b,double c,double d){

        double firstLine=Math.sqrt(Math.pow(Math.abs(a),2)) + Math.sqrt(Math.pow(Math.abs(b),2));
        double secondLine=Math.sqrt(Math.pow(Math.abs(c),2)) + Math.sqrt(Math.pow(Math.abs(d),2));

        if (firstLine>=secondLine){
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",c,d,a,b);
        }else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",a,b,c,d);
        }
    }
    public static void getLongestLine(double a,double b,double c,double d,double e,double f,double g,double h){

        double firstLine=Math.sqrt(Math.pow(Math.abs(a-c),2)) + Math.sqrt(Math.pow(Math.abs(b-d),2));
        double secondLine=Math.sqrt(Math.pow(Math.abs(e-g),2)) + Math.sqrt(Math.pow(Math.abs(f-h),2));

        if (firstLine>=secondLine){
            ClosestToZero(a,b,c,d);
        }else {
            ClosestToZero(e,f,g,h);
        }
    }
}
