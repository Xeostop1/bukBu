package review01;

public class ex02 {

	public static void main(String[] args) {
		int a=20, b=10, c=0;
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
		c=a%b;
		System.out.println(c);
		c=12%5;
		System.out.println(c);

		System.out.println("-----------------");
		
int i=5,j=5;
System.out.println(i++);
System.out.println(j++);
System.out.println("i="+i+", j="+j);
		
System.out.println("-----------------");

int k=5, g;
g=i++;
System.out.println("g="+g);
g=++i;
System.out.println("g="+g);
g=i--;
System.out.println("g="+g);
g=--i;
System.out.println("g="+g);
System.out.println();

System.out.println("ÇöÀç i="+i);
System.out.println("i++: "+i++);
System.out.println("++i: "+(++i));
System.out.println("i--: "+i--);
System.out.println("--i: "+(--i));

System.out.println("-----------------");

int x=+1;
int y=-2;
int z=5;
boolean d=true;

System.out.println(a);
System.out.println(b);
System.out.println(!d);

System.out.println("-----------------");

int u=1;
System.out.println(u);
i=-i;
System.out.println(u);
i=-i;
System.out.println(u);
i=-i;
System.out.println(u);

System.out.println("-----------------");


char a2='d';
char c2=(char)(a2+1);
System.out.println(c2);

char a3='y';
System.out.println((char)(a3-32));

char a4='R';
System.out.println((char)(a4+32));

System.out.println("-----------------");


int x1=10;
int y1=x1-- + 5 + --x1;
System.out.println("x1:"+x1+", y1:"+y1);


	}//main

}//class
