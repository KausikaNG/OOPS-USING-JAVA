import java.io.*;
public class Comm
{
public static void main(String[] args)
{
int array1[]={2,4,8};
int array2[]={2,3,4,8,10,16};
int array3[]={4,8,14,40};
for(int i=0;i<array1.length;i++)
{
for(int j=0;j<array2.length;j++)
{
for(int k=0;k<array3.length;k++)
{
if(array1[i]==array2[j] && array2[j]==array3[k])
{
System.out.println(array1[i]);
}
}
}
}
}
}