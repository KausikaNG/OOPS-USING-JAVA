import java.io.*;
import java.util.*;
public class Arrnum
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int test1=s.nextInt();
        int N1=s.nextInt();
        int a1[]=new int[N1];
int min=1;
for(int i=0;i<a1.length;i++)
{
a1[i]=s.nextInt();
}
if(a1[]==2)
{
System.out.println(a1[]-min);
}
else
{
System.out.println("nil");
}
 int test2=s.nextInt();
        int N2=s.nextInt();
        int a2[]=new int[N2];
int min=1;
for(int i=0;i<a2.length;i++)
{
a2[i]=s.nextInt();
}
if(a2[]==4)
{
System.out.println(a2[]-min);
}
else
{
System.out.println("nil");
}
    }
}