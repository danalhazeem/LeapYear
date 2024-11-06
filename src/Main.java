import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = myScanner.nextInt();

        if ((year%4 ==0 && year %100!=0)||year%400==0){
            System.out.println("it's a leap year");
        }
        else {
            System.out.println("it's not a leap year");
        }

        myScanner.close();
    }
}