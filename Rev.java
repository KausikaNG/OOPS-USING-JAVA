import java.io.*;
import java.util.*;
public class Rev
{
public static void main(String args[])
{
int n;
System.out.println("enter the value of n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int i;
for(i=100;i>=n;i--)
{
System.out.printf("%d",i);
}
}
}
