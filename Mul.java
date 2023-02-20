import java.io.*;
import java.util.*;
public class Mul
{
public static void main(String args[])
{
int n,i;
System.out.println("Enter any positive integer");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=10;i++)
{
System.out.printf("%d X %d =%d\n",n,i,n*i);
}

}
}
