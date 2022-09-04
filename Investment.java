import java.util. Scanner;
public class Investment {
public static void main (String[] args){
Scanner input= new Scanner (System.in);
// This line asks the user to input the investment amount
System.out.print ("Enter the Investment amount: "); double investmentAmount= input.nextInt() ;
// This line asks the user for the annual interest rate
System.out.print ("Enter the interest rate in percentage: "); double annualInterestRate= input.nextDouble();
// This line asks the user for the number of years
System.out.print ("Enter number of year: ");
int years =input.nextInt();
double monthlyInterestRate= (annualInterestRate) /1200 ; double InvestmentValuepart1=(1+monthlyInterestRate); double InvestmentValuepart2=(years*12) ;
double
// This will print out the accumulated value
InvestmentValuepart3=Math.pow(InvestmentValuepart1 , InvestmentValuepart2) ;
double futureInvestmentValue=investmentAmount* InvestmentValuepart3 ; System.out.println ("Accumulated value is:" + futureInvestmentValue);
}
}
