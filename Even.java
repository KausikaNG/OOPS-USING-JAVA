import java.io.*;
import java.util.*;
public class Even
{
public static void main(String args[])
{
int n;
System.out.println("enter the value of n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int sum=1;
int i=2;
while(i<=n)
{
sum=sum*i;
i=i+2;
}
System.out.printf("%d",sum);
}
}
