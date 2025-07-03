public class VowelsConsonants{
public static void main(String[]args){
int count=0;
String name="Jyoti your welcome to jermany";
char ch[]=name.toCharArray();
for(int i=0;i<ch.length;i++){
if(ch[i]=='A'|| ch[i]=='E' || ch[i]=='O' || ch[i]=='U' || ch[i]=='I' || ch[i]=='e' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='a' ||
ch[i]=='i'){
count++;
}
}
System.out.println(count);
}}


