import java.util.Scanner;

public class IT24102276Lab6Q2c{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int count = 1; 
int sum = 0;
String numbers = "";

while(count <= 10)
{
System.out.print("Enter number" + " " + count+ ":");
int no = input.nextInt();
numbers = numbers + no + " "; count++;
sum = sum +no;

}
System.out.println("The number you entered are :" );
System.out.println(numbers+ " ");

System.out.println("Sum of the numbers :" + sum );
System.out.println("Average of the numbers :" + sum/10);
}
}

