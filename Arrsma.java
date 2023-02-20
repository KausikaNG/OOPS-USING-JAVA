import java.io.*;
import java.util.*;
public class Arrsma
{
public static void main(String[] args)
{
int n,i,sum=0;
System.out.println("value of n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("enter the element");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
double avg=sum/n;
{
System.out.println(avg);

}
}