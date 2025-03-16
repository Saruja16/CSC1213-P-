class Operators{
public static void main(String[] args)
{
//unary operator
int x=7;
int y=-x;
System.out.println("Unary operator :" +y);

//Logical operator
boolean a=true;
boolean b=false;
System.out.println("Logical'AND':"+(a&&b));
System.out.println("Logical'OR':"+(a||b));
System.out.println("Logical'NOT':"+(!a));

//Relational operator
int n=10;
int m=20;
System.out.println("n is greater than m is " +(n>m));
System.out.println("n is less than m is " +(n<m));
System.out.println("n is equal to m is " +(n==m));
System.out.println("n is not equal to m is" +(n!=m));

//Assignment operator
int k=5;
k+=3;
System.out.println("Assignment operator:"+k);

//Ternary operator
int l=4;
int j=2;
int Max=(l>j)?l:j;
System.out.println("Terrory operator :"+Max);
}
}