public class ReverseString {
    public static void main(String[] args) {
        String name = "Jyoti Gaikwad";
        String rev = "";
String temp=name;
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
if(name.equals(rev)){
System.out.println("The String is palindrome");
    }
else{
System.out.println("The string is not palindrome");
}
}}