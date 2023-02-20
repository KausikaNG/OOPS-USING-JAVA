import java.io.*;
import java.util.*;
public class Arrls
{
public static void main(String[] args)
{
int n,i;
System.out.println("value of n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("enter the element");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int lar=a[0];
int sml=a[0];
for(i=0;i<n;i++)
{
if(lar<a[i])
{
lar=a[i];
}
else if(sml>a[i])
{
sml=a[i];
}
}
System.out.println(lar);
System.out.println(sml);
}
}