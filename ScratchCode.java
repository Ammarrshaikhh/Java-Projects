//package computeaveragescanner;
import java.util.Scanner; // Scanner is in the java.util package
import javax.swing.JOptionPane;
public class ScratchCode {

public static void main(String[] args) {

// Create a Scanner object
Scanner input = new Scanner(System.in);

// Prompt the user to enter three numbers
System.out.print("Enter three numbers: ");
double number1 = input.nextDouble();
double number2 = input.nextDouble();
double number3 = input.nextDouble();

// Compute average
double average = (number1 + number2 + number3) / 3;

// Display result

JOptionPane.showMessageDialog(null,"The average of " + number1 + ", " + number2
+ " , " + number3 + " is " + average);


}
}