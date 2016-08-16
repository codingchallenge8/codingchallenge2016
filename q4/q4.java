import java.util.*;
import java.lang.*;
import java.io.*;

class main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			x += 0.00001;
			
			double m1 = (2*y*x + Math.sqrt(4*Math.pow(y,2)*Math.pow(x,2) - 4*(Math.pow(x,2)-1)*(Math.pow(y,2)-1)))/(2*(Math.pow(x,2)-1));
			double c1 = y - m1*x;
			double m2 = (2*y*x - Math.sqrt(4*Math.pow(y,2)*Math.pow(x,2) - 4*(Math.pow(x,2)-1)*(Math.pow(y,2)-1)))/(2*(Math.pow(x,2)-1));
			double c2 = y - m2*x;
			
			
			System.out.println("(" + -m1 + ",1," + c1 + "," + -m2 + ",1," + c2 + ")");
		}
	}
}