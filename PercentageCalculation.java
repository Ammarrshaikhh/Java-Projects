import java.util.Scanner;
public class PercentageCalculation{

    public static void main (String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st subject mark");
        int s1=input.nextInt();
        System.out.println("Enter 2nd subject mark");
        int s2=input.nextInt();
        System.out.println("Enter 3rd subject mark");
        int s3=input.nextInt();
        System.out.println("Enter 4th subject mark");
        int s4=input.nextInt();
        System.out.println("Enter 5th subject mark");
        int s5=input.nextInt();

        int total_Marks = s1+s2+s3+s4+s5;

        float percentage = total_Marks*100/500;
        System.out.println("Your total marks = "+ total_Marks);
        System.out.println("Your percentage is ="+ percentage);


    }
}