
import java.util.Scanner;
public class ProgrammingAssignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int par = input.nextInt();
        int strokes = input.nextInt();
        
        if(par == 3){
            if(strokes == 2){
                System.out.println("Eagle");
            }
            else if(strokes == 3){
                System.out.println("Birdie");
            }
            else if(strokes == 4){
                System.out.println("Par");
            }
            else if(strokes == 5){
                System.out.println("Bogey");
            }
            else{
                System.out.println("Error");
            }
        }
        else if(par == 4){
            if(strokes == 3){
                System.out.println("Birdie");
            }
            else if(strokes == 4){
                System.out.println("Par");
            }
            else if(strokes == 5){
                System.out.println("Bogey");
            }
            else if(strokes == 2){
                System.out.println("Eagle");
            }
            else{
                System.out.println("Error");
            }
        }
        else if(par == 5){
            if(strokes == 3){
                System.out.println("Eagle");
            }
            else if(strokes == 4){
                System.out.println("Birdie");
            }
            else if(strokes == 5){
                System.out.println("Par");
            }
            else if(strokes == 6){
                System.out.println("Bogey");
            }
            else{
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Error");
        }
  }
}