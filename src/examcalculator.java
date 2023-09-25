import java.util.Scanner;

public class examcalculator {
    public static void main(String[] args) {
        float total = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter your marks for the subjects:");
            int marks = sc.nextInt();
            total +=marks;


        }
        avg  = (total/(n*100))*100;
        System.out.println("Your total percentage is "+ avg + "%");
        if ( avg<=100 && avg>=90){
            System.out.println("Grade - A+");

        } else if (avg<90&& avg>=80) {
            System.out.println("Grade - A");
        } else if (avg<80&& avg>=70) {
            System.out.println("Grade - B+");
        } else if (avg<70&& avg>=60) {
            System.out.println("Grade - B");
        } else if (avg<60&& avg>=50) {
            System.out.println("Grade - C+");
        } else if (avg<50&& avg>=40) {
            System.out.println("Grade - C");
        }else if (avg<40 && avg>=0) {
            System.out.println("Grade - D");
        }else {
            System.out.println("Error");
        }

    }
}

