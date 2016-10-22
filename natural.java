import java.io.*;
import java.util.*;
class natural
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,i=1;
System.out.println("Enter total natural number for finding sum:");
n=sc.nextInt();
  if(n<=0)
System.out.println("Error");
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("Sum of natural number is:"+sum);
}
}
