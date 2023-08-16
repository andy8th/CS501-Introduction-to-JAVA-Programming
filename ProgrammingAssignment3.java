import java.util.Scanner;

public class ProgrammingAssignment3 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = scnr.nextInt();

        int number;
        if (userNum < 11 || userNum > 100) {
            System.out.println("Input must be 11-100");
        } else {
            number = userNum;
            while (true) {
                System.out.print(number + " ");
                if (number % 11 == 0) {
                    break;
                }
                number--;
            }
            System.out.println();
        }
    }
}