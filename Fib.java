import java.io.*;
import java.util.*;
public class Fib
{
public static void main(String args[])
{
int n1=0,n2=1,n3;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
for(int i=0;i<=num;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.println(" " +n3);
}
}
}