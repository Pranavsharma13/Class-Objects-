/* Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
with separate methods for each operation whose real and imaginary parts are entered by user. */

import java.util.*;

class Q9Complex
{
		
	void add(int a, int b, int ci, int di) //formal arguments
	{
		int res_r= (a+b);    //real arguments
		int res_i=(ci+di); 
		if (res_i<0)
		{
		System.out.println("\nThe Addition is : "+res_r+" "+res_i+"i");
		}
		else
		{
		System.out.println("\nThe Addition is : "+res_r+"+"+res_i+"i");
			
		}	
	}
	
	void sub(int a, int b, int ci, int di) //formal arguments
	{
		int res_r= (a-b);    //real arguments
		int res_i=(ci-di); 
		if(res_i<0)
		{
		System.out.println("\nThe Substraction is : "+res_r+res_i+"i");
		}
		else
		{
			System.out.println("\nThe Substraction is : "+res_r+"+"+res_i+"i");
		}
	}
	
	void multiply(int a, int b, int ci, int di) //formal arguments
	{	// (a+ci)*(b+di)
		//(4+5i)(6+7i)=24+28i+30i+(35i^2)/aka -35\ =-11+58i
		int var1= (a*b);
		int var2 = (a*di)+(ci*b); //28+30
		int var4 = ((ci*di)*(-1)); //
		int res =var1+var4;
		if(var2<0)
		{
		System.out.println("\nThe Multiplication is : "+res+""+var2+ "i");
		}
		else
		{
			System.out.println("\nThe Multiplication is : "+res+"+"+var2+ "i");
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Real values : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter the Imag values : ");
		int ci=sc.nextInt();
		int di=sc.nextInt();
		Q9Complex c1=new Q9Complex();
		c1.add(a,b,ci,di);
		c1.sub(a,b,ci,di);
		c1.multiply(a,b,ci,di);
	}
}
