import java.io.PrintStream;
import java.util.*;
public class Leap
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%4==0) 
{
System.out.println(a+ "is a leap year");
}
else if(a%100==0)
{
System.out.println(a+ "is a not leap year");
}
else
{
System.out.println(a+ "is a not leap year");
}
}
}