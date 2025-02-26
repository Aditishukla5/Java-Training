class Nested
{
public static void main(String args[])
{
int a=10,b=20,c=15,big;
if(a>b)
{
   if(a>c)
    {
     big=a;
     }
    else
{
big=c;
}
}
else
{
if(b>c)
{
big=b;
}
else
{
big=c;
}
}
System.out.println("greater value is"+big);
}
}