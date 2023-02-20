import java.io.*;
import java.util.*;
public class Dig
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
int i=0,ans=0;
while(a>0)
{
 i=a%10;
{
if(i>ans)
{
 ans=i;
}
a=a/10;
}
}
System.out.printf("%d",ans);

}
}


