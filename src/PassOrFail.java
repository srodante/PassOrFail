import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        int score;

        do{

            System.out.println("Enter a student's test score. Type -1 to quit. ");
            score = keybd.nextInt();

        if (score > 0)
            if (score >= 60)
                System.out.println("Student passed");
            else
                System.out.println("Student failed");

    } while (score != -1);
    }
}
