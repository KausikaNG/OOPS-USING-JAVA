import java.io.PrintStream;
import java.util.*;
public class Oddeven
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%2==0) 
{
System.out.println(a+ "is an even integer");
}
else
{
System.out.println(a+ "is an odd integer");
}
}
}