import java.io.*;
public class Patternass
{
public static void main(String[] args)
{
int n=11;
for(int i=1;i<=11;i++,System.out.printf("\n"))
{
for(int j=1;j<=11;j++)
{
if(i==1 && j==5 || i==1 && j==6 || i==1 && j==7 || i==1 && j==8)
{
System.out.printf("#");
}
else if(i==11 && j==5 || i==11 && j==6 || i==11 && j==7 || i==11 && j==8)
{
System.out.printf("#");
}
else if(i==2 && j==3 || i==2 && j==4 || i==2 && j==9 || i==2 && j==10)
{
System.out.printf("*");
}
else if(i==10 && j==3 || i==10 && j==4 || i==10 && j==9 || i==10 && j==10)
{
System.out.printf("*");
}
else if(i==3 && j==2 || i==3 && j==3 || i==3 && j==10 || i==3 && j==11)
{
System.out.printf("*");
}
else if(i==9 && j==2 || i==9 && j==3 || i==9 && j==10 || i==9 && j==11)
{
System.out.printf("*");
}
else if(i==4 && j==1 || i==4 && j==2)
{
System.out.printf("#");
}
else if(i==5 && j==1 || i==5 && j==2)
{
System.out.printf("#");
}
else if(i==6 && j==1 || i==6 && j==2)
{
System.out.printf("#");
}
else if(i==7 && j==1 || i==7 &&j==2)
{
System.out.printf("#");
}
else if(i==8 && j==1 || i==8 && j==2)
{
System.out.printf("#");
}
else
{
System.out.printf(" ");
}
}
}
}
}
