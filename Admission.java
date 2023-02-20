import java.io.PrintStream;
import java.util.*;
public class Admission
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int maths=s.nextInt();
int phy=s.nextInt();
int chem=s.nextInt();
int total=maths+phy+chem;
int tot=maths+phy;
if(maths>=65 && phy>=55 && chem>=50 && total>=180 ) 
{
System.out.println("eligible");
}
else if(tot>=140)
{
System.out.println("eligible")
}
else
{
System.out.println(" not eligible");
}
}
}