import java.util.Scanner;

public class IT24102276Lab6Q1{
public static void main(String[] args){


Scanner input = new Scanner(System.in);
double no; 

System.out.print("Enter a number:");
no = input.nextDouble();

System.out.println("The square of"+ " " +no+" " +"is :" + no*no);
System.out.println("The square root of"+" "+ no+" " +"is :" + Math.sqrt(no));
}
}