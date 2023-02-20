import java.io.*;
import java.util.*;
public class Pnz
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
switch(a>0)
case 1:
System.out.println(positive);
break;
case 0:
switch(a<0)
{
case 1:
System.out.println(negative);
break;
case 0:
System.out.println(zero);
break;
}
break;
}
}



