public class primaryNo{
public static void main(String[]args){
int num=23;
int count=0;
for(int i=2;i<num/2;i++){
if(num%i==0){
count++;
break;
}
}
if(count==0){
System.out.println("The no is prime");
}else{
System.out.println("The no is not prime");
}}}