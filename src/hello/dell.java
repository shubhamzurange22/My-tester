package hello;
import java.util.Scanner;

class hp
{
	int x,y,z;
	void getvalue(int a,int b)
	{
		x=a;
		y=b;
	}
	void add()
	{
		z=x+y;
		System.out.println(z);
		
	}
}
public class dell{

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		 int v1=s.nextInt();
         System.out.println("2nd progream");
         int v2=s.nextInt();
         hp ll=new hp();
         ll.getvalue(v1, v2);
         ll.add();
        
	}

}
