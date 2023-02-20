import java.io.*;
import java.util.*;
public class Anagram
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int T=s.nextInt();
String str1=s.nextLine();
String str2=s.nextLine();
 int count=1;
if(str1==str2)
{
System.out.println();
}
else if(str1!=str2)
{
count++;
}

System.out.println(count);

}
}