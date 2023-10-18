import java.util.*;

public class Task_1 {

    static public void Guessing(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        
        System.out.print("Welcome to Number Guessing Game\nYou are given 5 attempts");
        int i = 4;

        while (i != 0) {
            System.out.println("\nGuess your number: ");
            int userInt = sc.nextInt();
            if (userInt > rand_int) {
                System.out.println("Your guess was to high");
            } else if (userInt < rand_int) {
                System.out.println("Your guess was to low");
            } else if (userInt == rand_int) {
                System.out.println("Congratulations! Your guess was correct");
                break;
            } else {
                System.out.println("Encoutered an error");
                Exception e = new Exception();
                e.printStackTrace();
            }
            i--;
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Guessing();
        System.out.print("Do you want to play again, Enter 1 for 'Yes' and 0 for 'No' : ");
        int ans = sc.nextInt();

        if(ans == 1){
            Guessing();
        } else if(ans == 0){
            System.out.println("Game over");
        } else {
            System.out.println("Wrong choice");
        }

    }
}