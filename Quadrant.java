import java.io.PrintStream;
import java.util.*;
public class Quadrant
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
if(a>0 && b>0) 
{
System.out.println("the coordinate point" a,b "first quadrant");
}
else if(a>0 && b<0)
{
System.out.println("second quadrant");
}
else if(a<0 && b<0)
{
System.out.println("third quadrant");
}
else
{
System.out.println("fourth quadrant");
}

}
}