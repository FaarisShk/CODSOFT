import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name and roll no: ");
        String name = sc.next();
        int roll = sc.nextInt();

        int[] marks = new int[5];
        int total_marks = 0;

        for(int i=0; i<marks.length; i++){
            System.out.println("Enter your marks in subject " + (i+1) + " : ");
            marks[i] = sc.nextInt();
            total_marks += marks[i];
        }

        int percentage = (int)((double)total_marks / 500 * 100);
        String grade = "x";

        if(percentage > 95){
            grade = "A+";
        } else if(percentage > 90 && percentage < 95){
            grade = "A";
        } else if(percentage > 80 && percentage < 90){
            grade = "B";
        } else if(percentage > 60 && percentage < 80){
            grade = "C";
        } else if(percentage > 40 && percentage < 60){
            grade = "D";
        } else if(percentage < 40){
            grade = "F";
        }

        System.out.println("-------------Marksheet-------------");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + total_marks + "/500");
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        
    }
}
