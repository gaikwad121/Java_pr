public class Fibonaci{
public static void main(String[]args){
int a=0; int b=1; int n=10;
System.out.print(a+" "+b);
for(int i=2;i<n;i++){
int temp=a+b;
System.out.println(temp);
a=b;
b=temp;    
}}
}