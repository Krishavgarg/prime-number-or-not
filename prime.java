class prime
{static void main(int a)
    {int h=a-1;int i=2;
    {while(i<a)
    if(a%i==0)
    {System.out.print("Not prime");
    i=a;i++;}
    else if(i==h)
    {System.out.print("prime");
    i=a;}
    else if(i<=h)
    i++;
}}}