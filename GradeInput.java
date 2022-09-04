import java.util.*;

public class GradeInput{

public static void main(String[] args) {

// scanner object to read input

Scanner input = new Scanner(System.in);

// asks user to enter first grade

System.out.print("Please enter the first grade : ");

int grade1 = input.nextInt();

// asks user to enter second grade

System.out.print("Please enter the second grade : ");

int grade2 = input.nextInt();

// finds the larger and smaller number of the 2 grades

int bigger = Math.max(grade1, grade2);

int smaller = Math.min(grade1, grade2);

// prints the message for the larger number

System.out.print(bigger+" is bigger than "+smaller);

// if the larger number is even

if(bigger%2==0){

// print the even message

System.out.print(" and it is even ");

}

// if larger number is odd

else{

// print the odd message

System.out.print(" and it is odd ");

}

// if the larger number is in range between 0 to 100 inclusive

if(bigger>=0 && bigger<=100){

// print within range messages

System.out.print("and "+bigger+" is within the range.");

}

// if not in range

else{

// print NOT within range messages

System.out.print("and "+bigger+" is NOT within the range.");

}

}

}