/* 22. Write a program to print the following pattern: 
********* 
 ******* 
 ***** 
 *** 
 * 
 *** 
 ***** 
 ******* 
*********

*/

class reversetiangle
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=5;j>i;j--)
{
System.out.print("");
}
for(int k=9;k>=(2*i-1);k--)
{
System.out.print("*");
}
System.out.println();
}

for(int i=2;i<=5;i++)
{
for(int j=1;j<i;j++)
{
System.out.print("");
}
for(int k=1;k<=(2*i-1);k++)
{
System.out.print("*");
}
System.out.println();
}
}



}