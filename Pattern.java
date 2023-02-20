import java.io.*;
import java.util.*;
public class Pattern
{
public static void main(String[] args)
{
int n=10,i,j;
for(i=1;i<=10;i++,System.out.printf("\n"))
{
for(j=1;j<=10;j++)
{
System.out.printf("@");
}
}
}
}
else if(i==2 || i==10 && j==3 || j==4 || j==9 || j==10)
{
System.out.printf("*");
}
else if(i==3 || i==9 && j==2 || j==3 || j==10 || j==11)
{
System.out.printf("*");
}
else if(i==4 || i==5 || i==6 || i==7 || i==8 && j==1 || j==2)
{
System.out.printf("#");
}
