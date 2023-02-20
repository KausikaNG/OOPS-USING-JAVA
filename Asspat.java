import java.io.*;
import java.util.*;
public class Asspat
{
public static void main(String[] args)
{
int i,j;
for(i=0;i<=6;i++,System.out.printf("\n"))
{
for(j=0;j<=16;j++)
{
if(i==0 && j==0)
{
System.out.printf("1");
}
else if(i==0 && j==12)
{
System.out.printf("13");
}
else if(i==1 && j==1)
{
System.out.printf("2");
}
else if(i==1 && j==11)
{
System.out.printf("12");
}
else if(i==1 && j==13)
{
System.out.printf("14");
}
else if(i==2 && j==2)
{
System.out.printf("3");
}
else if(i==2 && j==10)
{
System.out.printf("11");
}
else if(i==2 && j==14)
{
System.out.printf("15");
}
else if(i==3 && j==3)
{
System.out.printf("4");
}
else if(i==3 && j==9)
{
System.out.printf("10");
}
else if(i==3 && j==15)
{
System.out.printf("16");
}
else if(i==4 && j==4)
{
System.out.printf("5");
}
else if(i==4 && j==8)
{
System.out.printf("9");
}
else if(i==5 && j==5)
{
System.out.printf("6");
}
else if(i==5 && j==7)
{
System.out.printf("8");
}
else if(i==6 && j==6)
{
System.out.printf("7");
}
else
{
System.out.printf(" ");
}
}
}
}
}
