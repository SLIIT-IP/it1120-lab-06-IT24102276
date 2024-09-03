import java.util.Scanner;

public class IT24102276Lab6Q3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int x;
int x1 = 0;
int count = 0;

do
{
System.out.print("Enter positive integers( terminate input with -99 ): ");
x = input.nextInt();

if (x > 0)
{
x1 += x * x;
count++;
}

else if (x == -99)
{
break;
}

else
{
System.out.print("please enter a positive integer or -99 to terminate");
}
}while(true);

if (count > 0) 
{             
double rms = Math.sqrt((double) x1 / count);
System.out.println("The Root Mean Square (RMS) is: " + rms);
}

}
}