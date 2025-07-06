import java.util.Scanner;
public class SquareOrNot{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter breadth");
int breadth=sc.nextInt();
System.out.println("Enter length");
int length=sc.nextInt();
if(breadth==length){
System.out.println("It's a square");
}else{
System.out.println("It's not a square");
}}
}