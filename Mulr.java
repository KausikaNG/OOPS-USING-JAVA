import java.io.*;
import java.util.*;
public class Mulr
{
public static void main(String args[])
{
int n,i;
System.out.println("Enter any positive integer");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=10;i>=1;i--)
{
System.out.printf("%d X %d =%d\n",n,i,n*i);
}

}
}
