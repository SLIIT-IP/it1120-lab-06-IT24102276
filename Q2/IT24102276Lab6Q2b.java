import java.util.Scanner;

public class IT24102276Lab6Q2b{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int count = 1; 
String numbers = "";

while(count <= 10)
{
System.out.print("Enter number" + " " + count+ ":");
int no = input.nextInt();
numbers = numbers + no + " "; count++;

}
System.out.println("The number you entered are :" );
System.out.println(numbers+ " ");
}
}

