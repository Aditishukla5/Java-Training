 import java.util.*;
class Switch_case
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter character to be check");
ch=sc.next().charAt(0);
switch (ch)
{
case  'a':
case  'e':
case  'i':
case  'o':
case  'u':
System.out.println("vowel");
break;
default:
System.out.println("consonant");
}

}
}