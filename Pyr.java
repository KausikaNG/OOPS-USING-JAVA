import java.io.*;
import java.util.*;
public class Pyr
{
public static void main(String args[])
{
int i, j;
char c='E',alp='A';
for (i=1; i <=('E'-'A'+1); ++i)
{
for (j = 1; j <= i; ++j)
{
System.out.printf("%d",alp);
++alp;
}
System.out.printf("\n");
}
}
}

