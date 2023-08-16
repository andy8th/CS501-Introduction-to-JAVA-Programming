
import java.util.Scanner;

public class ProgrammingAssignment1 {
	public static void main(String[] args) 
	{

	      Scanner scnr = new Scanner(System.in);
	      int num1;
	      int num2;
	      int num3;
	      int num4;

	        num1 = scnr.nextInt();
	        num2 = scnr.nextInt();
	        num3 = scnr.nextInt();
	        num4 = scnr.nextInt();

	        int product;
	        product = (num1 * num2 * num3 * num4);
	        int average;
	        average = (num1 + num2 + num3 + num4) / 4;
	        
                double average_a;
	        average_a = (num1 + num2 + num3 + num4) / 4.0;
                double product_a;
                product_a = (double)num1 *(double)num2 * (double)num3 * (double)num4;

	        System.out.printf("%d %d\n",product , average);
	        System.out.printf("%.3f %.3f\n",product_a, average_a);

}
}