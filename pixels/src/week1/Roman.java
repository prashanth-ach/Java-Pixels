package tasks;
import java.io.*;
class Roman
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a Number : ");
int num=Integer.parseInt(br.readLine());
 
if(num>0 && num<1000)
{
 

String thou[]={"","M"};
String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
 

int th=num/1000;
int h=(num/100)%10;
int t=(num/10)%10;
int u=num%10;
 

System.out.println("Roman Number: "+thou[th]+hund[h]+ten[t]+unit[u]);
}
 
else
System.out.println("Invalid entry");
}
}
